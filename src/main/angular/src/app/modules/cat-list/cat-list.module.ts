import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CatListComponent } from './cat-list.component';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [CatListComponent],
  imports: [
    CommonModule,
    HttpClientModule,
    RouterModule
  ]
})
export class CatListModule { }
