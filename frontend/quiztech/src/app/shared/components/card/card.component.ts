import { ArrayOperationsService } from './../../services/util/array-operations.service';
import { Component, Input, OnInit } from '@angular/core';
import { ButtonSelectionService } from '../../services/button-selection/button-selection.service';
import { Question } from '../../model/questions';
import { QuestionService } from '../../services/question/question.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
})
export class CardComponent implements OnInit {
  @Input() theme: string = '';

  getAllQuestions: Question[] = [];
  questionsFiltred: Question[] = [];

  startedQuiz: boolean = false;
  isSelectedAllOptions: boolean = false;
  isQuizFinished: boolean = false;
  isInstructionsOpened: boolean = false;

  constructor(
    private arrayOperationsService: ArrayOperationsService,
    private btnService: ButtonSelectionService,
    private questionService: QuestionService
  ) {
    this.btnService.isSelectedAllOptions.subscribe((value) => {
      this.isSelectedAllOptions = value;
    });
    this.btnService.startedQuiz.subscribe((value) => {
      this.startedQuiz = value;
    });
    this.btnService.selectedFinishQuiz.subscribe((isFinished) => {
      this.isQuizFinished = isFinished;
    });
  }

  ngOnInit() {
    this.handleGetAllQuestions();
  }

  handleGetAllQuestions() {
    this.questionService.listQuestion().subscribe((questions) => {
      this.getAllQuestions = questions;
    });
  }

  handleSendStartQuiz() {
    this.btnService.setQuizStart();
    this.btnService.setRemoveFinishQuiz();
    this.handleFilterQuestionsByAttributesSelected();
  }

  handleChangeInstrucutonStatus() {
    this.isInstructionsOpened = !this.isInstructionsOpened;
  }

  handleFilterQuestionsByAttributesSelected() {
    this.questionsFiltred = this.getAllQuestions.filter(
      (element) =>
        element.area === this.btnService.selectedArea.value &&
        element.subject === this.btnService.selectedSubject.value &&
        element.difficult === this.btnService.selectedDifficult.value
    );
  }

  handleShuffleQuestionsAndAlternatives() {
     this.handleShuffleQuestions();
    this.questionsFiltred.forEach((question) => {
      question.alternatives =
        this.arrayOperationsService.handleRandomArrayElements([
          ...question.alternatives,
        ]);
    });
  }

  handleShuffleQuestions() {
    this.questionsFiltred =
      this.arrayOperationsService.handleRandomArrayElements([
        ...this.questionsFiltred,
      ]);
  }
}
