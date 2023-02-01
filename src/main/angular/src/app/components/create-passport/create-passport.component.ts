import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';
import { PassportServiceService } from 'src/app/services/passport-service/passport-service.service';
import { Passport } from 'src/app/models/Passport';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-create-passport',
  templateUrl: './create-passport.component.html',
  styleUrls: ['./create-passport.component.scss']
})
export class CreatePassportComponent implements OnInit {
  public passportForm: FormGroup;
  public passport: Passport;
  public readonly id = Number(this.activatedRoute.snapshot.paramMap.get('id'));
  public registered_cats: Passport;
  public readonly steps = [{
    id: 1,
    icon: '/assets/svg/paw.svg',
    title: 'Информация о котике',
    description: 'Укажите необходимую информацию о котике'
  }, {
    id: 2,
    icon: '/assets/svg/tasks.svg',
    title: 'Проверка информации',
    description: 'Проверьте корректность заполненных данных'
  }];
  public step = 1;

  constructor(
    private passportService: PassportServiceService,
    private router: Router,
    private fb: FormBuilder,
    private activatedRoute: ActivatedRoute,
    private http: HttpClient,
  ) { }

  ngOnInit(): void {
    this.passportForm = this.fb.group({
      name: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/)]),
      sex: 'male',
      breed: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/)]),
      cat_COLOR: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/)]),
      photo: 'https://i.artfile.ru/2048x1365_979558_[www.ArtFile.ru].jpg'
    });
    if (this.id) {
      this.http.get(`/catService/getCat?id=${this.id}`).subscribe((data: Passport) => {
        this.passportForm.setValue({
          name: data.name,
          sex: data.sex,
          breed: data.breed,
          cat_COLOR: data.cat_COLOR,
        });
      })
    }
  }
  public next(): void {
    switch (this.step) {
      case 1:
        this.step++;
        this.passport = this.passportForm.getRawValue();

        if (this.id) {
          this.passport.id = this.id;
        }

        break;
      case 2:
        this.http.post('/api/requisition/createRequisition', {
          fields: this.passport,
          name: 'Выдача пасспорта',
          serviceId: 440,
          status: 'ACCEPTED'
        })
        this.http.post('/api/create_passport/s1/save', {
          ...this.passport,
        }).subscribe(() => {
          if (this.id) {
            alert(`Котик #${this.id} успешно отредактирован`);
          } else {
            alert('Котик зарегистрирован в системе');
          }
          this.router.navigate(['/']);
        });
        break;
    }
  }

  public prev(): void {
    this.step--;
  }

  public saveData(): void{
    const data = {
      name: '',
      age: '',
    }
    //this.passportService.saveService(data).subscribe((res)=> {
    //});
    this.router.navigate(['/']);
  }

}
