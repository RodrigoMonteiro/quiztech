import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MaterialModule } from './material/material.module';
import { HeaderComponent } from './components/header/header.component';
import { SelectComponent } from './components/select/select.component';
import { SidenavComponent } from './components/sidenav/sidenav.component';
import { CardComponent } from './components/card/card.component';
import { QuestionComponent } from './components/question/question.component';
import { ButtonSelectionService } from './services/button-selection/button-selection.service';
import { ResultComponent } from './components/result/result.component';
import { DetailComponent } from './components/detail/detail.component';
import { InstructionsComponent } from './components/instructions/instructions.component';




@NgModule({
  declarations: [
    HeaderComponent,
    SelectComponent,
    SidenavComponent,
    CardComponent,
    QuestionComponent,
    ResultComponent,
    DetailComponent,
    InstructionsComponent,
  ],
  imports: [CommonModule, MaterialModule],
  exports: [
    MaterialModule,
    HeaderComponent,
    SelectComponent,
    SidenavComponent,
    CardComponent,
    ResultComponent
  ],
  providers: [ButtonSelectionService],
})
export class SharedModule {}
