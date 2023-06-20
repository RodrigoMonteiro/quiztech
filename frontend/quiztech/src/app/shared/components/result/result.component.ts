import { Component, Input } from '@angular/core';
import { ButtonSelectionService } from '../../services/button-selection/button-selection.service';
import { QuestionDataService } from '../../services/question/question-data/question-data.service';

@Component({
  selector: 'app-result',
  templateUrl: './result.component.html',
  styleUrls: ['./result.component.scss'],
})
export class ResultComponent {
  @Input() applicationTheme: string = '';
  finishMessageUser: string = 'Congrats! you finished the quiz and got (?/10)!';
  isDetailsOpen: boolean = false;

  constructor(private btnService: ButtonSelectionService, private questionData : QuestionDataService) {}

  handleRestartQuiz() {
    this.btnService.setRemoveFinishQuiz();
    this.questionData.handleRestartAllQuestionsSelected();
  }
  handleResetOptionsQuiz() {
    this.btnService.setQuizEnded();
    this.btnService.setSelectedFinishQuiz();
    this.btnService.handleResetAllOptionsSelected();
    this.questionData.handleResetAllQuiz();
  }

  handleOpenDetails() {
    this.isDetailsOpen = true;
  }
  handleCloseDetails() {
    this.isDetailsOpen = false;
  }
}
