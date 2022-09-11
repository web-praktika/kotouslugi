import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, FormsModule, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {SendPostComponentService} from "../../services/send-post-component.service";

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
    private http: HttpClient,
    private sendPostComp: SendPostComponentService
  ) { }

  typeLicense1 = '№1001 разрешение на одну атаку с высоты'

  ngOnInit(): void {
    this.petForm = this.fb.group({
      age: new FormControl('', [Validators.required, Validators.pattern(/^[0-9]+$/)]),
      name: new FormControl('',
        [Validators.required,Validators.pattern(/^([А-ЯЁ]{1}[а-яё]{3})/)]),
      lastName: new FormControl('', [Validators.required]),
      passportData: new FormControl('', [Validators.required,
        Validators.maxLength(4),Validators.pattern(/^[0-9]{4}/)]),
      selectedValue: new FormControl('1001' ),
    });

    this.flyingHeight = this.fb.group({
      height: '',
      time: ''
    });
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

  public next(): void {
    switch (this.step) {
      case 1:
        this.step++;
        break;
      case 2:
        this.step++;
        this.data = {
          ...this.petForm.getRawValue()
        };
        break;
      case 3:
        this.sendPostComp.postSend(this.data, this.router);
        break;
    }
  }
  public prev(): void {
    this.step--;
  }
}

