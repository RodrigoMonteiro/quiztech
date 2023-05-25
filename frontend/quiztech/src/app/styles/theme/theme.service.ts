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
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ThemeService {
  currentTheme: Theme = angularLight;
  private themeChangedSubject = new Subject<Theme>();
  themeChanged = this.themeChangedSubject.asObservable();

  constructor() {
    this.applyThemeProperties();
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

  applyThemeProperties(): void {
    const themeProperties = this.currentTheme.properties;
    Object.keys(themeProperties).forEach((property) => {
      document.documentElement.style.setProperty(
        property,
        themeProperties[property]
      );
    });
  }

  setTheme(theme: Theme): void {
    this.currentTheme = theme;
    this.themeChangedSubject.next(theme);
    this.applyThemeProperties();
  }
}
