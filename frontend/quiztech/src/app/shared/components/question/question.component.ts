import { QuestionService } from '../../services/question/question.service';
import { Component, Input, OnInit } from '@angular/core';
import { Question, questionTest } from '../../model/questionTest';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.scss'],
})
export class QuestionComponent implements OnInit {
  @Input() questionNumber: number = 0;
  alternativeSelected: string = '';
  questionTest: Question;
  getAllQuestions: Question[] = [];
  questionsByAttributesSelected: Question[] = [];

  constructor(private questionService: QuestionService) {
    this.questionTest = questionTest;
    this.handleGetAllQuestions();
  }
  ngOnInit() {
    this.handleGetAllQuestions();
  }

  handleNewSelectedAlternative(newValue: string) {
    this.alternativeSelected = newValue;
  }

  getLetterPrefix(index: number): string {
    return String.fromCharCode(65 + index);
  }

  handleGetAllQuestions() {
    this.questionService.listQuestion().subscribe((questions) => {
      this.getAllQuestions = questions;
    });
  }
  selectionQuestionsByAttributesSelected(
    area: string,
    subject: string,
    difficult: string
  ) {

  }
  test() {
    console.log(this.getAllQuestions);
  }
}
