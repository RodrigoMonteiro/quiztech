import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Question } from '../../model/questionTest';

@Injectable({
  providedIn: 'root',
})
export class QuestionService {
  private readonly apiURL: string = 'http://localhost:8080/api/questions';

  constructor(private httpClient: HttpClient) {}

  listQuestion() {
    return this.httpClient.get<Question[]>(this.apiURL);
  }
}
