import { QuestionService } from '../../services/question/question.service';
import { Component } from '@angular/core';
import { Question } from '../../model/questions';
import { ButtonSelectionService } from '../../services/button-selection/button-selection.service';
import { QuestionDataService } from '../../services/question/question-data/question-data.service';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.scss'],
})
export class QuestionComponent {

  questionIndex: number = 0;
  getAllQuestions: Question[] = [];
  questionsByAttributesSelected: Question[] = [];
  area: string = '';
  tech: string = '';
  difficult: string = '';

  constructor(
    private questionService: QuestionService,
    private btnService: ButtonSelectionService,
    private questionDataService: QuestionDataService
  ) {
    this.handleGetAllQuestions();

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

  handleNewSelectedAlternative(questionIndex: number, newValue: string) {
    this.questionDataService.handleChangeSelectedAlternativeQuestion(
      questionIndex,
      newValue
    );
    // this.questionDataService.getAllQuestionData()
  }

  getLetterPrefix(index: number): string {
    return String.fromCharCode(65 + index);
  }

  handleGetAllQuestions() {
    this.questionService.listQuestion().subscribe((questions) => {
      this.getAllQuestions = questions;
      this.selectionQuestionsByAttributesSelected();
      this.questionsByAttributesSelected.forEach((question, index) => {
        this.questionDataService.handleGetCorrectAlternatives(
          index,
          question.answer,
          question.text
        );
      });
    });
  }

  selectectedAlternative(index: number): string{
    return this.questionDataService.getAlternativeSelected(index)
  }


  selectionQuestionsByAttributesSelected() {
    this.questionsByAttributesSelected = this.getAllQuestions.filter(
      (question) =>
        question.area === this.area &&
        question.subject === this.tech &&
        question.difficult === this.difficult
    );
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
