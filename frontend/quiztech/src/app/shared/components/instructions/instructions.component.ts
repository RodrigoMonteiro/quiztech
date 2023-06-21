import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-instructions',
  templateUrl: './instructions.component.html',
  styleUrls: ['./instructions.component.scss'],
})
export class InstructionsComponent {

  @Output() handleBackOptionsCard = new EventEmitter();

  handleEmitChangeAction(){
    this.handleBackOptionsCard.emit()
  }
}
