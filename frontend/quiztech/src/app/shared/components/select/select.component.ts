import { Component, OnInit } from '@angular/core';
import { Theme, allThemes } from '../../../styles/theme/theme';
import { ThemeService } from 'src/app/styles/theme/theme.service';

@Component({
  selector: 'app-select',
  templateUrl: './select.component.html',
  styleUrls: ['./select.component.scss'],
})
export class SelectComponent implements OnInit {
  listThemeItems: Theme[] = [];

  constructor(private themeService: ThemeService) {

  }

  ngOnInit(): void {
    this.listThemeItems = allThemes;
  }

  switchTheme(techName: string, theme: string) {
    this.listThemeItems.forEach((e) =>
      e.techName === techName && e.theme === theme
        ? this.themeService.setTheme(e)
        : ''
    );
    console.log('New theme is ', this.themeService.currentTheme);
  }
}
