import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PassportServiceService {

  constructor(private http: HttpClient) {
  }

  public saveService(data): Observable<any> {
   return this.http.post('/api/блаблабла', {
            fields: data,
            name: 'Название услуги',
            serviceId: 1,
            status: 'ACCEPTED'
          });
  }
}
