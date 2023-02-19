import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './components/header/header.component';
import { MainModule } from './modules/main/main.module';
import { CatListModule } from './modules/cat-list/cat-list.module';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { OrderStepsComponent } from './components/order-steps/order-steps.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { VetComponent } from './components/vet/vet.component';
import { ReactiveFormsModule } from '@angular/forms';
import { OrdersModule } from './modules/orders/orders.module';
import { KotopravaComponent } from './components/kotoprava/kotoprava.component';
import { CatstestComponent } from './components/catstest/catstest.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    OrderStepsComponent,
    RegistrationComponent,
    VetComponent,
    NotFoundComponent,
    KotopravaComponent,
    CatstestComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    MainModule,
    OrdersModule,
    CatListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
