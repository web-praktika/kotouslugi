import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import {MainComponent} from "./modules/main/main.component";
import {MainModule} from "./modules/main/main.module";
import { RegistrationComponent } from './components/registration/registration.component';
import { OrderStepsComponent } from './components/order-steps/order-steps.component';
import {ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    RegistrationComponent,
    OrderStepsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MainModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
