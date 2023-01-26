import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { MainComponent } from './main.component';
import { SliderComponent } from './components/slider/slider.component';
import { CatalogComponent } from './components/catalog/catalog.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    MainComponent,
    SliderComponent,
    CatalogComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    RouterModule,
    FormsModule
  ]
})
export class MainModule { }
