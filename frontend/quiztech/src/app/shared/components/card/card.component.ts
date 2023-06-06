import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
})
export class CardComponent {

  @Input() btnAreaSelected: string = '';
  @Input() btnTechSelected: string = '';
  @Input() btnDifficultSelected: string = '';

  isButtonReady: boolean = false;

  isStatusButtonReady(){

  }

}
