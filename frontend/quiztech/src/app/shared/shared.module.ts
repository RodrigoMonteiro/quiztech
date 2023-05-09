import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MaterialModule } from './material/material.module';
import { HeaderComponent } from './components/header/header.component';
import { SelectComponent } from './components/select/select.component';
import { SelectItemComponent } from './components/select-item/select-item.component';



@NgModule({
  declarations: [HeaderComponent, SelectComponent, SelectItemComponent],
  imports: [CommonModule, MaterialModule],
  exports: [
    MaterialModule,
    HeaderComponent,
    SelectComponent,
    SelectItemComponent,
  ],
})
export class SharedModule {}
