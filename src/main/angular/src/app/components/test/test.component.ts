import { Component, NgModule, OnInit } from '@angular/core';
import { TestServiceService } from '../../services/test-service/test-service.service'
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import {max} from "rxjs/operators";
import {isAsciiLetter} from "codelyzer/angular/styles/chars";

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.scss']
})



export class TestComponent implements OnInit {


  public ownerData: any;
  public ownerAddress: any;
  public catData: any;
  public count = 0;
  public breeds: any;
  public cities: any;
  public ownerRegistrationForm: FormGroup;
  public catRegistrationForm: FormGroup;
  public isCat = false;
  public readonly steps = [{
                      id: 1,
                      icon: '/assets/svg/test.svg',
                      title: 'Регистрация хозяина',
                      description: 'Укажите необходимую информацию о владельце котика'
                    }, {
                      id: 2,
                      icon: '/assets/svg/paw.svg',
                      title: 'Регистрация котика',
                      description: 'Укажите необходимую информацию о котике'
                    }, {
                      id: 3,
                      icon: '/assets/svg/tasks.svg',
                      title: 'Подтверждение заявки',
                      description: 'Проверьте корректность заполнения данных'
                    }];
  public step = 1;
  public phone = '';
  public s = '';
  public phoneMask = { mask: "+{00}(0000)00-0000" };

  constructor(
    private testService : TestServiceService,
    private router: Router,
    private formBuilder: FormBuilder,
    private http: HttpClient
  ) { }

  ngOnInit(): void {
      this.ownerRegistrationForm = this.formBuilder.group({
        name: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/), Validators.minLength(2),Validators.maxLength(20)]),
        surname: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/), Validators.minLength(2),Validators.maxLength(20)]),
        middle_NAME: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/), Validators.minLength(2),Validators.maxLength(50)]),
        city: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/)]),
        district: new FormControl('', [Validators.required, Validators.pattern("^[0-9А-Яа-я -]*$"), Validators.minLength(2),Validators.maxLength(64)]),
        street: new FormControl('', [Validators.required, Validators.pattern("^[0-9А-Яа-я -]*$"), Validators.minLength(2),Validators.maxLength(128)]),
        building: new FormControl('', [Validators.minLength(1),Validators.maxLength(128)]),
        phone_NUMBER: new FormControl('', [Validators.minLength(10),Validators.maxLength(11),Validators.pattern('^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$')]),
        email: new FormControl('', [Validators.maxLength(50), Validators.email]),
      });
      this.catRegistrationForm = this.formBuilder.group({
        name: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/), Validators.minLength(2),Validators.maxLength(20)]),
        sex: 'Кот',
        breed: '',
        catAge: new FormControl('', [Validators.required, Validators.pattern(/^[\d]+$/), Validators.max(25),Validators.min(1)]),
        weight: new FormControl('', [Validators.required, Validators.pattern("^([+]?\\d+([\\.]\\d{1,3})?)"), Validators.max(22),Validators.min(0.1)]),
        vaccination_CERTIFICATE: 'Да',
      });
      this.getData();
  }

  get _getCatName() {
    return this.catRegistrationForm.get('name')
  }
  public goToNextStep(): void {
      switch (this.step) {
        case 1:
          this.step++;
          this.isCat = false;
          this.createOwnerDataToPOST();
         // this.http.get<any>('/api/createuser/get').subscribe(dt => {
          //  dt.content.forEach((element) => {

           //   this.count = element.id;
          //  });
          //});
          break;
        case 2:
          this.step++;
          this.isCat = true;
          this.createCatDataToPOST();
          break;
        case 3:
          if(!this.isCat)
          {
            this.http.post('/api/createuser/save', {...this.ownerData,}).subscribe(() => {
              this.http.post('/api/address/save', {...this.ownerAddress,}).subscribe(() => {
                alert('Вы зарегистрированы в системе');
              });
              this.router.navigate(['/']);
            });
          }
          else {
            this.http.post('/api/createuser/save', {...this.ownerData,}).subscribe(() => {
              this.http.post('/api/address/save', {...this.ownerAddress,}).subscribe(() => {
                this.http.post('/api/createcat/save', {...this.catData}).subscribe(() => {
                  alert('Вы зарегистрированы в системе');
                })
                this.router.navigate(['/']);
              });
            });
          }
          break;
      }
    }

    public skipStep(): void {
      this.step+=2;
      this.createOwnerDataToPOST();
    }

    public prev(): void {
      this.step--;
    }

    public createOwnerDataToPOST() : void {
      this.ownerData = {
        name: this.ownerRegistrationForm.get('name').value,
        surname: this.ownerRegistrationForm.get('surname').value,
        middle_NAME: this.ownerRegistrationForm.get('middle_NAME').value,
        phone_NUMBER: this.ownerRegistrationForm.get('phone_NUMBER').value,
        email: this.ownerRegistrationForm.get('email').value
        //...this.ownerRegistrationForm.getRawValue(),
        //...this.catRegistrationForm.getRawValue()
      };
      this.ownerAddress = {
        owner_ID: this.count + 1,
        city: this.ownerRegistrationForm.get('city').value,
        district: this.ownerRegistrationForm.get('district').value,
        street: this.ownerRegistrationForm.get('street').value,
        building: this.ownerRegistrationForm.get('building').value
      };
    }
  public createCatDataToPOST() : void {
    this.catData = {
      owner_ID: this.count + 1,
      name: this.catRegistrationForm.get('name').value,
      sex: this.catRegistrationForm.get('sex').value,
      breed: this.catRegistrationForm.get('breed').value,
      age: this.catRegistrationForm.get('catAge').value,
      weight: this.catRegistrationForm.get('weight').value,
      vaccination_CERTIFICATE: this.catRegistrationForm.get('vaccination_CERTIFICATE').value,
    };
  }
  public getData() : void {
    this.http.get<any>('/api/breed/get').subscribe(dt => { this.breeds = dt.content; });
    this.http.get<any>('/api/getcity/get').subscribe(dt => { this.cities = dt.content; });
    this.http.get<any>('/api/createuser/get').subscribe(dt => {
      dt.content.forEach((element) => {
        this.count = element.id;
      });
    });
  }

}
