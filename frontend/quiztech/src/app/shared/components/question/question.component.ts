import { Component } from '@angular/core';
import { Question, questionTest } from '../../model/questionTest';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.scss'],
})
export class QuestionComponent {
  alternativeSelected: string = '';
  questionTest: Question;

  constructor() {
    this.questionTest = questionTest;
  }

  handleNewSelectedAlternative(newValue: string) {
    this.alternativeSelected = newValue;
  }

  getLetterPrefix(index: number): string {
    return String.fromCharCode(65 + index);
  }
}
