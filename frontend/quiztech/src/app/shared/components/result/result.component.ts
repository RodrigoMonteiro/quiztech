import { Component, Input } from '@angular/core';
import { ButtonSelectionService } from '../../services/button-selection/button-selection.service';

@Component({
  selector: 'app-result',
  templateUrl: './result.component.html',
  styleUrls: ['./result.component.scss'],
})
export class ResultComponent {
  @Input() applicationTheme: string = '';
  finishMessageUser: string = 'Congrats! you finished the quiz and got (?/10)!';
  isDetailsOpen: boolean = false;

  constructor(private btnService: ButtonSelectionService) {}

  handleRestartQuiz() {
    this.btnService.setRemoveFinishQuiz();
  }
  handleResetOptionsQuiz() {
    this.btnService.setQuizEnded();
    this.btnService.setSelectedFinishQuiz();
    this.btnService.handleResetAllOptionsSelected();
  }

  handleOpenDetails() {
    this.isDetailsOpen = true;
  }
  handleCloseDetails() {
    this.isDetailsOpen = false;
  }
}
