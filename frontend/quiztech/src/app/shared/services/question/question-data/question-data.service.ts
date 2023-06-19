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

  getAllQuestionData() {
    console.log(this.questionData.value);
  }

  handleGetCorrectAlternatives(index: number, correctAlternative: string) {
    const currentData = this.questionData.getValue();

    if (!currentData[index]) {
      currentData[index] = {
        questionIndex: index,
        alternativeSelected: '',
        alternativeCorrect: '',
      };
    }

    currentData[index].alternativeCorrect = correctAlternative;
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
}
