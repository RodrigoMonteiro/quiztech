import { Component, EventEmitter, Input, OnChanges, Output } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
})
export class CardComponent implements OnChanges {
  @Input() theme: string = '';
  @Input() btnAreaSelected: string = '';
  @Input() btnTechSelected: string = '';
  @Input() btnDifficultSelected: string = '';
// HERE
  @Input() startQuiz: boolean = false;
  @Output() EmitStartQuiz = new EventEmitter<boolean>();

  isButtonReady: boolean = false;
  questionNumberIndex: number = 1

  ngOnChanges() {
    this.isButtonReady =
      this.btnAreaSelected !== '' &&
      this.btnTechSelected !== '' &&
      this.btnDifficultSelected !== '';
  }
  handleSendStartQuiz() {
    this.EmitStartQuiz.emit(true);
  }
}

