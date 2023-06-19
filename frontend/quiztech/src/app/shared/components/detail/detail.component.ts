import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.scss'],
})
export class DetailComponent {
  @Output() backInformationSection = new EventEmitter();

  handleInformationSection(){
    this.backInformationSection.emit()
  }
}
