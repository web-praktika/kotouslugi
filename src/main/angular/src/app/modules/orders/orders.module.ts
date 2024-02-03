import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OrdersComponent } from './orders.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [OrdersComponent],
  imports: [
    CommonModule,
    HttpClientModule
  ]
})
export class OrdersModule { }
