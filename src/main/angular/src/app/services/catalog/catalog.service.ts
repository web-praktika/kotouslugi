import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { CatalogResponse, Service } from '../../models/catalog-response';

@Injectable({
  providedIn: 'root'
})
export class CatalogService {
  private readonly icons = [{
    id: 0,
    src: '/assets/icons/cat_walk.png'
  }, {
    id: 1,
    src: '/assets/icons/cat_pirate.png'
  }, {
    id: 2,
    src: '/assets/icons/cat_clean.png'
  }, {
    id: 3,
    src: '/assets/icons/cat_gift.png'
  }, {
    id: 4,
    src: '/assets/icons/cat_grumpy.png'
  }, {
    id: 5,
    src: '/assets/icons/cat_poo.png'
  }];

  constructor(
    private http: HttpClient
  ) { }

  public loadServices(): Observable<Service[]> {
    return this.http.post('/api/listService', null).pipe(
      map((data: CatalogResponse) => data.content)
    );
  }

  public getServiceIcon(id: number): string {
    return this.icons.find(icon => icon.id === id).src;
  }
}
