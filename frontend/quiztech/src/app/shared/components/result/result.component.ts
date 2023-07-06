import { Component, Input, EventEmitter, Output } from '@angular/core';
import { ButtonSelectionService } from '../../services/button-selection/button-selection.service';
import { QuestionDataService } from '../../services/question/question-data/question-data.service';

@Component({
  selector: 'app-result',
  templateUrl: './result.component.html',
  styleUrls: ['./result.component.scss'],
})
export class ResultComponent {
  @Output() shuffleAlternatives = new EventEmitter();
  @Input() applicationTheme: string = '';
  isDetailsOpen: boolean = false;
  finalResultQuiz: number = 0;

  constructor(
    private btnService: ButtonSelectionService,
    private questionDataService: QuestionDataService
  ) {
    this.handleGetFinalResult();
  }

  handleRestartQuiz() {
    this.btnService.setRemoveFinishQuiz();
    this.questionDataService.handleRestartAllQuestionsSelected();
     this.shuffleAlternatives.emit();
  }


  handleResetOptionsQuiz() {
    this.btnService.setQuizEnded();
    this.btnService.setSelectedFinishQuiz();
    this.btnService.handleResetAllOptionsSelected();
    this.questionDataService.handleResetAllQuiz();
  }

  handleOpenDetails() {
    this.isDetailsOpen = true;
  }
  handleCloseDetails() {
    this.isDetailsOpen = false;
  }

  handleGetFinalResult() {
    let result = this.questionDataService.getAllQuestionData();
    result.forEach((question) => {
      if (question.alternativeCorrect === question.alternativeSelected) {
        this.finalResultQuiz += 1;
      }
    });
  }
}
