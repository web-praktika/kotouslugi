import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-vet',
  templateUrl: './vet.component.html',
  styleUrls: ['./vet.component.scss']
})
export class VetComponent implements OnInit {

  public petForm: FormGroup;
  public vetForm: FormGroup;
  public data: any;
  public readonly steps = [{
    id: 1,
    icon: '/assets/svg/paw.svg',
    title: 'Информация о пациенте',
    description: 'Укажите необходимую информацию о пациенте'
  }, {
    id: 2,
    icon: '/assets/svg/hospital.svg',
    title: 'Выбор специалиста',
    description: 'Укажите специалиста и время приема'
  }, {
    id: 3,
    icon: '/assets/svg/tasks.svg',
    title: 'Подтверждение заявки',
    description: 'Проверьте корректность заполнения заявки'
  }];
  public step = 1;

  constructor(
    private router: Router,
    private fb: FormBuilder,
    private http: HttpClient
  ) { }

  ngOnInit(): void {
    this.petForm = this.fb.group({
      name: '',
      lastName: '',
      sex: 'male',
      age: '',
      email: '',
      phone: ''
    });

    this.vetForm = this.fb.group({
      doctorName: '',
      time: ''
    });
  }

  public next(): void {
    switch (this.step) {
      case 1:
        this.step++;
        break;
      case 2:
        this.step++;
        this.data = {
          ...this.petForm.getRawValue(),
          ...this.vetForm.getRawValue()
        };
        break;
      case 3:
        this.http.post('/api/requisition/createRequisition', {
          fields: this.data,
          name: 'Название услуги',
          serviceId: 1,
          status: 'ACCEPTED'
        }).subscribe(() => {
          alert('Заявка успешно подана');
          this.router.navigate(['/']);
        });
        break;
    }
  }

  public prev(): void {
    this.step--;
  }

}
