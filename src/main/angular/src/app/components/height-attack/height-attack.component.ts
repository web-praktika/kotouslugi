import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, FormsModule, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-height-attack',
  templateUrl: './height-attack.component.html',
  styleUrls: ['./height-attack.component.scss']
})
export class HeightAttackComponent implements OnInit {

  public petForm: FormGroup;
  public flyingHeight: FormGroup;
  public data: any;
  public readonly steps = [{
    id: 1,
    icon: '/assets/svg/paw.svg',
    title: 'Персональная информация котика',
    description: 'Пользователь перешел в раздел получения прав охоты на двуногих'
  }, {
    id: 2,
    icon: '/assets/svg/bitten.svg',
    title: 'Ожидаемое времени и высоты полета',
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



  ngOnInit(): void {
    this.petForm = this.fb.group({
      name: new FormControl('', [Validators.required,Validators.pattern(/^([А-ЯЁ]{1}[а-яё]{3})/)]),
      PassportData: new FormControl('', [Validators.required,
        Validators.maxLength(4),Validators.pattern(/^[0-9]{4}/)]),
      age: new FormControl('', [Validators.required, Validators.pattern(/^[0-9]+$/)]),
      selectedValue: new FormControl('', )
    });

    this.flyingHeight = this.fb.group({
      height: '',
      time: ''
    });
  }

  selectedValueArray = [
    {id: 1, title: 'внезапная атака с высот'},
    {id: 2, title: 'смена игры на охоту'}
  ]



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

  public next(): void {
    switch (this.step) {
      case 1:
        this.step++;
        break;
      case 2:
        this.step++;
        this.data = {
          ...this.petForm.getRawValue()
          // ...this.flyingHeight.getRawValue()
        };
        break;
      case 3:
        // Api вставить /api/requisition/createRequisition
        this.http.post('/api/licenceRequisition/createLicenceRequisition', {
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

