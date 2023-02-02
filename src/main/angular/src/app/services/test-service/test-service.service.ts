import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs'
@Injectable({
  providedIn: 'root'
})
export class TestServiceService {

  constructor(
    private http: HttpClient
  ) { }

  public saveService(data) : Observable<any> {
    return this.http.post('/api/requisition/createRequisition', {
                     fields: data,
                     name: 'Название услуги',
                     serviceId: 1,
                     status: 'ACCEPTED'
                   });
  }
}
