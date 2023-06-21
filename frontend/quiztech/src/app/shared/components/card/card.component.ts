import { Component, EventEmitter, Input, Output } from '@angular/core';
import { ButtonSelectionService } from '../../services/button-selection/button-selection.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
})
export class CardComponent {

  @Input() theme: string = '';
  startedQuiz: boolean = false;
  isSelectedAllOptions: boolean = false;
  isQuizFinished: boolean = false;
  isInstructionsOpened: boolean = false;

  constructor(private btnService: ButtonSelectionService) {

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

  handleSendStartQuiz() {
    this.btnService.setQuizStart();
    this.btnService.setRemoveFinishQuiz();
  }

  handleChangeInstrucutonStatus(){
    this.isInstructionsOpened = !this.isInstructionsOpened
  }

}
