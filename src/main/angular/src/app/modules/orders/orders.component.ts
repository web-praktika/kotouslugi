import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CatalogService } from '../../services/catalog/catalog.service';
import { Service } from '../../models/catalog-response';
import { forkJoin } from 'rxjs';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.scss']
})
export class OrdersComponent implements OnInit {

  public loading = true;
  public orders: any;
  public services: any;

  constructor(
    private catalog: CatalogService,
    private http: HttpClient
  ) { }

  ngOnInit(): void {
    forkJoin([
      this.http.post('/api/requisition/listRequisition', null),
      this.catalog.loadServices()
    ]).subscribe((data: [any, Service[]]) => {
      this.orders = data[0].content;
      this.services = data[1];
      this.loading = false;
    });

    forkJoin([
          this.http.post('/api/kotopravaRequisition/listPravaRequisition', null),
          this.catalog.loadServices()
        ]).subscribe((data: [any, Service[]]) => {
          this.orders = data[0].content;
          this.services = data[1];
          this.loading = false;
        });
  }

  public getServiceIcon(id: number): string {
    return this.catalog.getServiceIcon(id);
  }

  public getServiceName(id: number): string {
    return this.services.find((service) => service.id === id).name;
  }

}
