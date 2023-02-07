import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-crossing',
  templateUrl: './crossing.component.html',
  styleUrls: ['./crossing.component.scss']
})
export class CrossingComponent implements OnInit {

    public humanForm: FormGroup;
    public PetForm: FormGroup;
    public crossingForm: FormGroup;
    public data: any;
    public readonly steps = [{
      id: 1,
      icon: '/assets/svg/ok.svg',
      title: 'Информация о хозяине',
      description: 'Укажите необходимую информацию о хозяине'
    }, {
      id: 2,
      icon: '/assets/svg/paw.svg',
      title: 'Информация о питомце',
      description: 'Укажите необходимую информацию о питомце'
    }, {
      id: 3,
      icon: '/assets/svg/paw.svg',
      title: 'Выбор кавалера',
      description: 'Выбор кандидата'
    }, {
      id: 4,
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

    this.humanForm = this.fb.group({
      HumanName: '',
      HumanAge: '',
      number: '',
      mail: ''
    });
      this.PetForm = this.fb.group({
        name: '',
        lastName: '',
        sex: 'male',
        age: '',
        weight: '',
        color: ''
    });
    this.crossingForm = this.fb.group({
        candidate:''
    });
  }
   public next(): void {
    switch (this.step) {
      case 1:
        this.step++;
        break;
      case 2:
        this.step++;
        break;
      case 3:
        this.step++;
        this.data = {
          ...this.humanForm.getRawValue(),
          ...this.PetForm.getRawValue(),
          ...this.crossingForm.getRawValue()
        };
        break;
       case 4:
        this.http.post('/api/requisition/createRequisition', {
          fields: this.data,
          name: 'Название услуги',
          serviceId: 6,
          status: 'ACCEPTED'
        }).subscribe(() => {
          alert('Позже хозяин второго кота свяжется с вами');
          this.router.navigate(['/']);
        });
        break;
    }
  }


  public prev(): void {
    this.step--;
  }
}
