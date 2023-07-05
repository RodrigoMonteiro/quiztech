import { Component, EventEmitter, Output } from '@angular/core';
import { QuestionData } from '../../model/questions';
import { QuestionDataService } from '../../services/question/question-data/question-data.service';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.scss'],
})
export class DetailComponent {
  @Output() backInformationSection = new EventEmitter();
  resultIndex: number = 0;
  resultQuiz: QuestionData[] = [];
  handleInformationSection() {
    this.backInformationSection.emit();
  }

  constructor(private questionService: QuestionDataService) {
    this.resultQuiz = this.questionService.questionData.value;
  }

  handleSpecificQuestion(newIndex: number) {
    this.resultIndex = newIndex;
  }
  handleNextQuestion() {
    this.resultIndex =
      this.resultIndex + 1 >= 10 ? 9 : this.resultIndex + 1;
  }
  handlePrevQuestion() {
    this.resultIndex =
      this.resultIndex - 1 <= 0 ? 0 : this.resultIndex - 1;
  }
}
