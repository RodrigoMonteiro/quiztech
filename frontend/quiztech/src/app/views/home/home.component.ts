import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { ThemeService } from './../../styles/theme/theme.service';
import { ButtonSelectionService } from 'src/app/shared/services/button-selection/button-selection.service';

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
  //HERE
  startQuiz: boolean = false;

  constructor(
    private themeService: ThemeService,
    private btnService: ButtonSelectionService
  ) {
    this.btnService.selectedArea.subscribe((area) => {
      this.selectedArea = area;
    });

    this.btnService.selectedSubject.subscribe((subject) => {
      this.selectedSubject = subject;
    });

    this.btnService.selectedDifficult.subscribe((difficult) => {
      this.selectedDifficult = difficult;
    });
  }

  ngOnInit(): void {
    this.currentThemeName = this.themeService.currentTheme.techName;
    this.themeSubscription = this.themeService.themeChanged.subscribe(
      (theme) => {
        this.currentThemeName = theme.techName;
      }
    );
  }

  handleStartQuiz() {
    this.startQuiz = true;
  }

  handleEndQuiz() {
    this.startQuiz = false;
  }

  ngOnDestroy(): void {
    this.themeSubscription.unsubscribe();
  }
}
