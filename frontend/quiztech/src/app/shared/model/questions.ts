export interface Question {
  id: number;
  text: string;
  area: string;
  subject: string;
  difficult: string;
  answer: string;
  alternatives: string[];
}

export interface QuestionData {
  questionIndex: number;
  alternativeSelected: string;
  alternativeCorrect: string;
  questionText: string
}
