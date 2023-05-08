import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-select-item',
  templateUrl: './select-item.component.html',
  styleUrls: ['./select-item.component.scss'],
})
export class SelectItemComponent {
  @Input() name: string = 'test name';
  @Input() tech: string = 'test tech';
  @Input() theme: string = 'test theme';
}
