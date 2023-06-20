import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MaterialModule } from './material/material.module';
import { HeaderComponent } from './components/header/header.component';
import { SelectComponent } from './components/select/select.component';
import { SelectItemComponent } from './components/select-item/select-item.component';
import { SidenavComponent } from './components/sidenav/sidenav.component';
import { CardComponent } from './components/card/card.component';
import { QuestionComponent } from './components/question/question.component';
import { ButtonSelectionService } from './services/button-selection/button-selection.service';
import { ResultComponent } from './components/result/result.component';
import { DetailComponent } from './components/detail/detail.component';




@NgModule({
  declarations: [
    HeaderComponent,
    SelectComponent,
    SelectItemComponent,
    SidenavComponent,
    CardComponent,
    QuestionComponent,
    ResultComponent,
    DetailComponent,
  ],
  imports: [CommonModule, MaterialModule],
  exports: [
    MaterialModule,
    HeaderComponent,
    SelectComponent,
    SelectItemComponent,
    SidenavComponent,
    CardComponent,
    ResultComponent
  ],
  providers: [ButtonSelectionService],
})
export class SharedModule {}
