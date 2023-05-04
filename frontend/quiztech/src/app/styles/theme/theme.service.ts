import { Injectable } from '@angular/core';
import {
  Theme,
  angularLight,
  angularDark,
  reactLight,
  reactDark,
  vueLight,
  vueDark,
} from './theme';

@Injectable({
  providedIn: 'root',
})
export class ThemeService {
  private currentTheme: Theme = angularLight;

  constructor() {
    this.applyTheme();
  }

  getThemes(): Theme[] {
    return [
      angularLight,
      angularDark,
      reactLight,
      reactDark,
      vueLight,
      vueDark,
    ];
  }

  setTheme(theme: Theme): void {
    this.currentTheme = theme;
    this.applyTheme();
  }

  private applyTheme(): void {
    Object.keys(this.currentTheme.properties).forEach((property) => {
      document.documentElement.style.setProperty(
        property,
        this.currentTheme.properties[property]
      );
    });
  }
}
