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
  questionNumberIndex: number = 1;

  constructor(private btnService: ButtonSelectionService) {

    this.btnService.isSelectedAllOptions.subscribe((value) => {
      this.isSelectedAllOptions = value;
    });
    this.btnService.startedQuiz.subscribe((value) => {
      this.startedQuiz = value;
    });
  }

  handleSendStartQuiz() {
    this.btnService.setQuizStart();
  }
}
