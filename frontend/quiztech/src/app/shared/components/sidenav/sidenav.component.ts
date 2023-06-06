import { Component, EventEmitter, Input, Output } from '@angular/core';
import { areas } from '../../model/areas';
import {difficults} from '../../model/difficults'
import { frontTechs, backTechs, devOpsTechs } from '../../model/techs';


@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.scss'],
})
export class SidenavComponent {
  constructor() {
    this.quizAreas = areas;
    this.quizDifficults = difficults;
    this.quizFrontTechs = frontTechs;
    this.quizBackTechs = backTechs;
    this.quizDevOpsTechs = devOpsTechs;
  }
  @Input() btnAreaSelected: string = '';
  @Input() btnTechSelected: string = '';
  @Input() btnDifficultSelected: string = '';
  @Input() isStartedQuiz: boolean = false;
  @Output() selectedAreaChange = new EventEmitter<string>();
  @Output() selectedSubjectChange = new EventEmitter<string>();
  @Output() selectedDifficultChange = new EventEmitter<string>();

  quizAreas: string[];
  quizDifficults: string[];
  quizFrontTechs: string[];
  quizBackTechs: string[];
  quizDevOpsTechs: string[];

  handleSelectedArea(area: string) {
    this.selectedAreaChange.emit(area);
  }

  handleSelectedSubject(subject: string) {
    this.selectedSubjectChange.emit(subject);
  }

  handleSelectedDifficult(difficult: string) {
    this.selectedDifficultChange.emit(difficult);
  }
}
