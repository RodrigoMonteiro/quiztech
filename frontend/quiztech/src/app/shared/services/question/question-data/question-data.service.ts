import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { QuestionData } from 'src/app/shared/model/questions';

@Injectable({
  providedIn: 'root',
})
export class QuestionDataService {
  questionData: BehaviorSubject<QuestionData[]> = new BehaviorSubject<
    QuestionData[]
  >([]);
  constructor() {}

  getAllQuestionData(): QuestionData[] {
    return this.questionData.value;
  }

  handleGetCorrectAlternatives(
    index: number,
    correctAlternative: string,
    questionText: string
  ) {
    const currentData = this.questionData.getValue();

    if (!currentData[index]) {
      currentData[index] = {
        questionIndex: index,
        alternativeSelected: '',
        alternativeCorrect: '',
        questionText: '',
      };
    }

    currentData[index].alternativeCorrect = correctAlternative;
    currentData[index].questionText = questionText;
    this.questionData.next(currentData);
  }

  handleChangeSelectedAlternativeQuestion(
    index: number,
    alternativeSelected: string
  ) {
    const currentData = this.questionData.getValue();
    currentData[index].alternativeSelected = alternativeSelected;
    this.questionData.next(currentData);
  }

  getAlternativeSelected(index: number) {
    return this.questionData.value[index]?.alternativeSelected;
  }

  handleRestartAllQuestionsSelected() {
    const currentData = this.questionData.getValue();
    for (const question of currentData) {
      question.alternativeSelected = '';
      question.questionText = '';
    }
    this.questionData.next(currentData);
  }

  handleResetAllQuiz() {
    const currentData = this.questionData.getValue();
    for (const question of currentData) {
      question.alternativeSelected = '';
      question.alternativeCorrect = '';
      question.questionText = '';
    }
    this.questionData.next(currentData);
  }
}


