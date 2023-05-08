import { Component, OnInit } from '@angular/core';
import { Theme, allThemes } from '../../../styles/theme/theme';


@Component({
  selector: 'app-select',
  templateUrl: './select.component.html',
  styleUrls: ['./select.component.scss'],
})
export class SelectComponent implements OnInit {
  listThemeItems: Theme[] = [];

  ngOnInit(): void {
   this.listThemeItems = allThemes
   console.log(this.listThemeItems)
  }


}
