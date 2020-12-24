import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MainComponent } from './modules/main/main.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { ServiceComponent } from './modules/service/service.component';
import { OrdersComponent } from './modules/orders/orders.component';
import { ServiceGuard } from './guards/service/service.guard';

const routes: Routes = [{
  path: '',
  component: MainComponent
}, {
  path: '404',
  component: NotFoundComponent
}, {
  path: 'service/:id',
  component: ServiceComponent,
  canActivate: [ServiceGuard]
}, {
  path: 'orders',
  component: OrdersComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
