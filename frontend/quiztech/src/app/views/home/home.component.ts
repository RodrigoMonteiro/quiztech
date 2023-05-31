import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { ThemeService } from './../../styles/theme/theme.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent implements OnInit, OnDestroy {

  currentThemeName: string = '';
  themeSubscription: Subscription = Subscription.EMPTY;
  selectedArea: string = '';
  selectedSubject: string = '';
  selectedDifficult: string = '';

  constructor(private themeService: ThemeService) {}

  ngOnInit(): void {
    this.currentThemeName = this.themeService.currentTheme.techName;
    this.themeSubscription = this.themeService.themeChanged.subscribe(
      (theme) => {
        this.currentThemeName = theme.techName;
      }
    );
  }

  handleSelectedArea(area: string) {
    this.selectedArea = area;
  }
  handleSelectedSubject(subject: string) {
    this.selectedSubject = subject;
  }
  handleSelectedDifficult(difficult: string) {
    this.selectedDifficult = difficult;
  }

  ngOnDestroy(): void {
    this.themeSubscription.unsubscribe();
  }
}
