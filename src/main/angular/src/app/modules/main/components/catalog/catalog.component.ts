import { Component, Input, OnInit } from '@angular/core';
import { Service } from '../../../../models/catalog-response';
import { CatalogService } from '../../../../services/catalog/catalog.service';

@Component({
  selector: 'app-catalog',
  templateUrl: './catalog.component.html',
  styleUrls: ['./catalog.component.scss']
})
export class CatalogComponent implements OnInit {

  @Input() public search: string;
  public loading = true;
  private services: Service[];

  constructor(
    private catalog: CatalogService
  ) { }

  ngOnInit(): void {
    this.catalog.loadServices().subscribe((data: Service[]) => {
      this.services = data;
      this.loading = false;
    })
  }

  public getIcon(id: number): string {
    return this.catalog.getServiceIcon(id);
  }

  public get items(): Service[] {
    return this.services.filter((item) => item.name.match(new RegExp(this.search, 'i')));
  }

}
