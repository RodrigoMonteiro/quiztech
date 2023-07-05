import { Component, Input } from '@angular/core';
import { ButtonSelectionService } from '../../services/button-selection/button-selection.service';
import { Question } from '../../model/questions';
import { QuestionService } from '../../services/question/question.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
})
export class CardComponent {
  @Input() theme: string = '';
  getAllQuestions: Question[] = [];

  startedQuiz: boolean = false;
  isSelectedAllOptions: boolean = false;
  isQuizFinished: boolean = false;
  isInstructionsOpened: boolean = false;

  constructor(
    private btnService: ButtonSelectionService,
    private questionService: QuestionService
  ) {
    this.handleGetAllQuestions();

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

  handleGetAllQuestions() {
    this.questionService.listQuestion().subscribe((questions) => {
      this.getAllQuestions = questions
    });

  }

  handleSendStartQuiz() {
    this.btnService.setQuizStart();
    this.btnService.setRemoveFinishQuiz();
  }

  handleChangeInstrucutonStatus() {
    this.isInstructionsOpened = !this.isInstructionsOpened;
  }
}
