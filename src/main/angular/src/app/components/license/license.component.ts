import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-license',
  templateUrl: './license.component.html',
  styleUrls: ['./license.component.scss']
})
export class LicenseComponent implements OnInit {

  public petForm: FormGroup;
  public peopleForm: FormGroup;
  public data: any;
  public readonly steps = [{
    id: 1,
    icon: '/assets/svg/paw.svg',
    title: 'Информация о котике',
    description: 'Укажите необходимую информацию о для оформления Кусь'
  }, {
    id: 2,
    icon: '/assets/svg/bitten.svg',
    title: 'Информация о человеке, которого сделать нежный Кусь',
    description: 'Укажите человека и время Кусь'
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

  typeLicense1 = '№2002 лицензия на один Кусь'

  ngOnInit(): void {
    this.petForm = this.fb.group({
      name: new FormControl('', [Validators.required, Validators.pattern(/^([А-ЯЁ]{1}[а-яё]{3})/)]),
      PassportData: new FormControl('', [Validators.required,
        Validators.maxLength(4),Validators.pattern(/^[0-9]{4}/)]),
      age: new FormControl('', [Validators.required, Validators.pattern(/^[0-9]+$/)]),
      selectedValue: new FormControl('№1001' ),
      email: new FormControl(''),
      phone: new FormControl('+7', [Validators.pattern(/^((8|\+7)[\- ]?)?(\(?\d{3}\)?[\- ]?)?[\d\- ]{10,15}$/)]),
    });

    this.peopleForm = this.fb.group({
      PeopleName: '',
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
        }
        break;
      case 3:
        // Api вставить /api/requisition/createRequisition
        this.http.post('', {
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

  writeInfo ( Form: any){
    let textInfoArray = [
      'Поля со звездочкой обязательны к заполнению',
      'Проверьте корректность введенных данных',
    ]
    if (Form.invalid && Form.touched){
      return textInfoArray[1];
    }else{
      return textInfoArray[0]
    }
  }

  public prev(): void {
    this.step--;
  }
}
