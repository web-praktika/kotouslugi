import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Service} from "../models/catalog-response";
import {Router} from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class SendPostComponentService {

  constructor(private http: HttpClient, private router: Router) { }

  public postSend(data, router): any {
    this.http.post('/api/licenceRequisition/listLicenceRequisition', data)
    .subscribe(() => {
    alert('Заявка успешно подана');
    this.router.navigate(['/']);
    });
    this.http.post('/api/licenceRequisition/listLicenceRequisition', {
    fields: data,
    status: 'ACCEPTED'
    });
    this.http.post('/api/requisition/updateRequisition', {
    fields: data,
    });
  }
}
