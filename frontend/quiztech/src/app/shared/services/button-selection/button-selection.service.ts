import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ButtonSelectionService {
  selectedArea: BehaviorSubject<string> = new BehaviorSubject<string>('');
  selectedSubject: BehaviorSubject<string> = new BehaviorSubject<string>('');
  selectedDifficult: BehaviorSubject<string> = new BehaviorSubject<string>('');
  isSelectedAllOptions: BehaviorSubject<boolean> = new BehaviorSubject<boolean>(
    false
  );
  startedQuiz: BehaviorSubject<boolean> = new BehaviorSubject<boolean>(false);

  constructor() {}

  setSelectedArea(area: string) {
    this.selectedArea.next(area);
    this.handleStatusQuiz();
  }

  setSelectedSubject(subject: string) {
    this.selectedSubject.next(subject);
    this.handleStatusQuiz();
  }

  setSelectedDifficult(difficult: string) {
    this.selectedDifficult.next(difficult);
    this.handleStatusQuiz();
  }

  setQuizStart() {
    this.startedQuiz.next(true);
  }
  setQuizEnded() {
    this.startedQuiz.next(false);
  }
  private handleStatusQuiz() {
    const area = this.selectedArea.value;
    const subject = this.selectedSubject.value;
    const difficult = this.selectedDifficult.value;

    this.isSelectedAllOptions.next(
      area !== '' && subject !== '' && difficult !== ''
    );
  }
}
