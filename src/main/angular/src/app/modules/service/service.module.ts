import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ServiceComponent } from './service.component';
import { OrderStepsComponent } from './components/order-steps/order-steps.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    ServiceComponent,
    OrderStepsComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule
  ]
})
export class ServiceModule { }
