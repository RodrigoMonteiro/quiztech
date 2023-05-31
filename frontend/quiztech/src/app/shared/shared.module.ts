import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MaterialModule } from './material/material.module';
import { HeaderComponent } from './components/header/header.component';
import { SelectComponent } from './components/select/select.component';
import { SelectItemComponent } from './components/select-item/select-item.component';
import { SidenavComponent } from './components/sidenav/sidenav.component';



@NgModule({
  declarations: [HeaderComponent, SelectComponent, SelectItemComponent, SidenavComponent],
  imports: [CommonModule, MaterialModule],
  exports: [
    MaterialModule,
    HeaderComponent,
    SelectComponent,
    SelectItemComponent,
    SidenavComponent
  ],
})
export class SharedModule {}
