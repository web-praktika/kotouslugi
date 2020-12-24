import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './components/header/header.component';
import { MainModule } from './modules/main/main.module';
import { OrdersModule } from './modules/orders/orders.module';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { ServiceModule } from './modules/service/service.module';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NotFoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MainModule,
    OrdersModule,
    ServiceModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
