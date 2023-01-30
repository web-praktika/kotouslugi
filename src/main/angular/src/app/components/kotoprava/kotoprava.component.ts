import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-kotoprava',
  templateUrl: './kotoprava.component.html',
  styleUrls: ['./kotoprava.component.scss']
})
export class KotopravaComponent implements OnInit {

  public petForm: FormGroup;
  public passportForm: FormGroup;
  public certificatesForm: FormGroup;
  public otdelsForm: FormGroup;
  public readonly steps = [{
      id: 1,
      icon: '/assets/icons/cat_purr.png',
      title: 'Познакомимся?',
      description: 'Немного подробнее о вас, мистер Котик'
    }, {
      id: 2,
      icon: '/assets/icons/cat_moustache.png',
      title: 'Паспорт котика',
      description: 'Ну уж а куда вы и без вет.паспорта'
    }, {
      id: 3,
      icon: '/assets/icons/cat_laptop.png',
      title: 'Ещё документики',
      description: 'Ну тут справка и сертификат нужён'
    }, {
      id: 4,
      icon: '/assets/icons/cat_upsidedown.png',
      title: 'Где получим то?',
      description: 'Выбери подразделение и дату-время'
   }, {
      id: 5,
      icon: '/assets/svg/ok.svg',
      title: 'Проверь-ка',
      description: 'Проверяй, чтоб всё правильно было!'
   }];
    public step = 1;

  constructor(
  private fb: FormBuilder,
  private router: Router) { }

  ngOnInit(): void {
    this.petForm = this.fb.group({
        name: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/)]),
        breed: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/)]),
        sex: 'male',
        age:  new FormControl('', [Validators.required, Validators.pattern(/^[1-50]+$/)])
    });

    this.passportForm = this.fb.group({
        passportId: new FormControl('', [Validators.required, Validators.pattern(/^[\d]+$/)]),
        passportDate: '',
        numDepartment: new FormControl('', [Validators.required, Validators.pattern(/^[\d]+$/)]),
        registration: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё\d]+$/)])
    });

    this.certificatesForm = this.fb.group({
        educationPlace: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/)]),
        eduCertificateNumber: new FormControl('', [Validators.required, Validators.pattern(/^[\d]+$/)]),
        eduCertificateDate: '',
        medCertificateNumber: new FormControl('', [Validators.required, Validators.pattern(/^[\d]+$/)]),
        medCertificateDate: ''
    });

    this.otdelsForm = this.fb.group({
        addressOtdel: '',
        dateOtdel: '',
        timeOtdel: ''
    });
  }

  public next(): void {
    switch(this.step) {
    case 1:
        this.step++;
        break;
    case 2:
        this.step++;
        break;
    case 3:
        this.step++;
        break;
    case 4:
        this.step++;
        break;
    case 5:
        alert('Ну всё получается, заявку подали, права будут');
        this.router.navigate(['/']);
        break;
    }
  }

    public prev(): void {
        this.step--;
      }

}
