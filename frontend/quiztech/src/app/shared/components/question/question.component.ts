import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';
import { Question } from '../../model/questions';
import { ButtonSelectionService } from '../../services/button-selection/button-selection.service';
import { QuestionDataService } from '../../services/question/question-data/question-data.service';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.scss'],
})
export class QuestionComponent implements  OnInit {

  @Input() questionsByAttributesSelected: Question[] = [];

  questionIndex: number = 0;

  area: string = '';
  tech: string = '';
  difficult: string = '';

  constructor(
    private btnService: ButtonSelectionService,
    private questionDataService: QuestionDataService
  ) {

    this.btnService.selectedArea.subscribe((area) => {
      this.area = area;
    });

    this.btnService.selectedSubject.subscribe((subject) => {
      this.tech = subject;
    });

    this.btnService.selectedDifficult.subscribe((difficult) => {
      this.difficult = difficult;
    });
  }
  ngOnInit(): void {
    this.questionsByAttributesSelected.forEach((question, index) => {
      this.questionDataService.handleGetCorrectAlternatives(
        index,
        question.answer,
        question.text
      );
    });
  }

  handleNewSelectedAlternative(questionIndex: number, newValue: string) {
    this.questionDataService.handleChangeSelectedAlternativeQuestion(
      questionIndex,
      newValue
    );
  }

  getLetterPrefix(index: number): string {
    return String.fromCharCode(65 + index);
  }

  selectectedAlternative(index: number): string {
    return this.questionDataService.getAlternativeSelected(index);
  }


  handleNextQuestion() {
    this.questionIndex = this.questionIndex >= 9 ? 9 : this.questionIndex + 1;
  }

  handlePrevQuestion() {
    this.questionIndex = this.questionIndex <= 0 ? 0 : this.questionIndex - 1;
  }

  handleFinishQuiz() {
    this.btnService.setSelectedFinishQuiz();
  }
}
