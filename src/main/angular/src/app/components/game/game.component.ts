import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {SendPostComponentService} from "../../services/send-post-component.service";

@Component({
  selector: 'app-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.scss']
})
export class GameComponent implements OnInit {

  public petForm: FormGroup;
  public peopleForm: FormGroup;
  public data: any;
  public readonly steps = [{
    id: 1,
    icon: '/assets/svg/paw.svg',
    title: 'Информация о котике',
    description: 'Укажите необходимую информацию о для оформления лицензии на охоту'
  }, {
    id: 2,
    icon: '/assets/svg/bitten.svg',
    title: 'Информация о человеке, на которого объявлена охота',
    description: 'Укажите время охоты на человеков'
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
  ) {}


  typeLicense3 = '№3003 лицензия смена игры на охоту'

  ngOnInit(): void {
    this.petForm = this.fb.group({
      age: new FormControl('', [Validators.required, Validators.pattern(/^[0-9]+$/)]),
      name: new FormControl('',
        [Validators.required,Validators.pattern(/^([А-ЯЁ]{1}[а-яё]{3})/)]),
      lastName: new FormControl(''),
      passportData: new FormControl('', [Validators.required,
        Validators.maxLength(4),Validators.pattern(/^[0-9]{4}/)]),
      selectedValue: new FormControl('3003' ),
      licenceN: new FormControl('+7', [Validators.pattern(/^((8|\+7)[\- ]?)?(\(?\d{3}\)?[\- ]?)?[\d\- ]{10,15}$/)]),
    });

    this.peopleForm = this.fb.group({
      PeopleName: '',
      time: ''
    });
  }
  response:any

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
        this.sendPostComp.postSend(this.data, this.router);
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
