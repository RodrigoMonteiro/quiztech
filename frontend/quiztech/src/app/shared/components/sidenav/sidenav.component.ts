import { Component, EventEmitter, Input, Output } from '@angular/core';
import { areas } from '../../model/areas';
import { difficults } from '../../model/difficults';
import { frontTechs, backTechs, devOpsTechs } from '../../model/techs';
import { ButtonSelectionService } from '../../services/button-selection/button-selection.service';

@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.scss'],
})
export class SidenavComponent {

  isStartedQuiz: boolean = false;

  btnAreaSelected: string = '';
  btnTechSelected: string = '';
  btnDifficultSelected: string = '';

  quizAreas: string[];
  quizDifficults: string[];
  quizFrontTechs: string[];
  quizBackTechs: string[];
  quizDevOpsTechs: string[];

  constructor(private btnService: ButtonSelectionService) {

    this.btnService.selectedArea.subscribe((area) => {
      this.btnAreaSelected = area;
    });

    this.btnService.selectedSubject.subscribe((subject) => {
      this.btnTechSelected = subject;
    });

    this.btnService.selectedDifficult.subscribe((difficult) => {
      this.btnDifficultSelected = difficult;
    });

    this.btnService.startedQuiz.subscribe((isStarted) => {
      this.isStartedQuiz = isStarted
    })

    this.quizAreas = areas;
    this.quizDifficults = difficults;
    this.quizFrontTechs = frontTechs;
    this.quizBackTechs = backTechs;
    this.quizDevOpsTechs = devOpsTechs;
  }

  handleSelectedArea(area: string) {
    this.btnService.setSelectedArea(area);
    this.btnService.setSelectedSubject("")
  }

  handleSelectedSubject(subject: string) {
    this.btnService.setSelectedSubject(subject);
  }

  handleSelectedDifficult(difficult: string) {
    this.btnService.setSelectedDifficult(difficult);
  }
}
