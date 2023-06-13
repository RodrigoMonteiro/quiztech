import { QuestionService } from '../../services/question/question.service';
import { Component, Input, OnInit } from '@angular/core';
import { Question, questionTest } from '../../model/questionTest';
import { ButtonSelectionService } from '../../services/button-selection/button-selection.service';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.scss'],
})
export class QuestionComponent implements OnInit {
  @Input() questionNumber: number = 0;
  alternativeSelected: string = '';
  questionTest: Question;
  getAllQuestions: Question[] = [];
  questionsByAttributesSelected: Question[] = [];
  area: string = '';
  tech: string = '';
  difficult: string = '';

  constructor(
    private questionService: QuestionService,
    private btnService: ButtonSelectionService
  ) {
    this.questionTest = questionTest;
    this.handleGetAllQuestions();

    this.btnService.selectedArea.subscribe((area) => {
      this.area = area;
    });

    this.btnService.selectedSubject.subscribe((subject) => {
      this.tech = subject;
    });

    this.btnService.selectedDifficult.subscribe((difficult) => {
      this.difficult = difficult;
    });
  }
  ngOnInit() {
    this.selectionQuestionsByAttributesSelected();
  }

  handleNewSelectedAlternative(newValue: string) {
    this.alternativeSelected = newValue;
  }

  getLetterPrefix(index: number): string {
    return String.fromCharCode(65 + index);
  }

  handleGetAllQuestions() {
    this.questionService.listQuestion().subscribe((questions) => {
      this.getAllQuestions = questions;
      this.selectionQuestionsByAttributesSelected();
    });
  }

  selectionQuestionsByAttributesSelected() {
    this.questionsByAttributesSelected = this.getAllQuestions.filter(
      (question) =>
        question.area === this.area &&
        question.subject === this.tech &&
        question.difficult === this.difficult
    );
    console.log(this.questionsByAttributesSelected);
  }
}
