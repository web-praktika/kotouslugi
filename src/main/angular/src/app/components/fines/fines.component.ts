import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-fines',
  templateUrl: './fines.component.html',
  styleUrls: ['./fines.component.scss']
})
export class FinesComponent implements OnInit {

  public data: any;
  public ownersSurnames: any;
  public Cats: any;
  public breeds: any;
  public catFinesForm: FormGroup;
  public ownerFinesForm: FormGroup;
  public ID = 0;
  public cat_ID = 0;
  public contentsOutput: any;
  public fine: any;
  public tests: any;

  public readonly steps = [{
    id: 1,
    icon: '/assets/svg/paw.svg',
    title: 'Заполните личные данные о коте',
    description: 'Укажите необходимую информацию о котике'
  }, {
    id: 2,
    icon: '/assets/svg/tasks.svg',
    title: 'Заполните личные данные о хозяине',
    description: 'Укажите необходимую информацию о хозяине'
  }, {
    id: 3,
    icon: '/assets/svg/tasks.svg',
    title: 'Просмотр информации о наличии КотоШтрафов',
    description: 'Посмотрите что необходимо оплатить'
  }, {
    id: 4,
    icon: '/assets/svg/tasks.svg',
    title: 'Оплатить штраф',
    description: 'Оплатите штраф'
  }];
  public step = 1;

  constructor(
    private router: Router,
    private formBuilder: FormBuilder,
    private http: HttpClient
  ) { }

  ngOnInit(): void {
    this.catFinesForm = this.formBuilder.group({
      // tslint:disable-next-line:max-line-length
      catName: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/), Validators.minLength(2), Validators.maxLength(20)]),
      age: new FormControl('', [Validators.required, Validators.pattern(/^[\d]+$/), Validators.max(10)]),
      sex: 'Кот',
      // tslint:disable-next-line:max-line-length
      breed: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/), Validators.minLength(2), Validators.maxLength(20)]),
      // tslint:disable-next-line:max-line-length
      color: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/), Validators.minLength(2), Validators.maxLength(40)]),
      weight: new FormControl('', [Validators.required, Validators.pattern('^([+-]?\\d+([\\.]\\d{1,3})?)'), Validators.max(12)]),
    });
    this.ownerFinesForm = this.formBuilder.group({
      // tslint:disable-next-line:max-line-length
      ownerName: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/), Validators.minLength(2), Validators.maxLength(20)]),
      // tslint:disable-next-line:max-line-length
      surname: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/), Validators.minLength(2), Validators.maxLength(20)]),
      // tslint:disable-next-line:max-line-length
      middle_NAME: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/), Validators.minLength(2), Validators.maxLength(50)]),
      passportNumber: new FormControl('', [Validators.required, Validators.pattern(/^[\d]+$/), Validators.maxLength(6)]),
      phone_NUMBER: new FormControl('', [Validators.minLength(10), Validators.maxLength(11), Validators.pattern('^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$')]),
    });
  }

  public Next(): void {
    switch (this.step) {
      case 1:
        this.step++;
        // this.http.get<any>('/api/createuser/get').subscribe(dt => {
        //  dt.content.forEach((element) => {

        //   this.count = element.id;
        //  });
        // });
        break;
      case 2:
        this.step++;
        this.data = {
          ...this.catFinesForm.getRawValue(),
          ...this.ownerFinesForm.getRawValue(),
        };
        this.http.post('/api/catfines/save', {...this.data}).subscribe(() => {
          this.http.get<any>('/api/catfines/get').subscribe(dt => {
            dt.content.forEach((element) => {
              this.cat_ID = element.id;
            });
            this.http.post('/api/fines/save', {title: 'Превышение полномочий',
              desc: 'Заглушка для демонстрации',
              cost: 113,
              catId: this.cat_ID, }).subscribe(() => {
              // tslint:disable-next-line:no-shadowed-variable
              this.http.get<any>('/api/fines/get').subscribe(dt => {
                // this.Cats = dt.content;
                this.tests = dt.content;
                this.contentsOutput = {
                  catId: dt.content.find(x => x.catId === this.cat_ID).catId,
                  desc: dt.content.find(x => x.catId === this.cat_ID).desc,
                  cost: dt.content.find(x => x.catId === this.cat_ID).cost,
                  title: dt.content.find(x => x.catId === this.cat_ID).title,
                  id: dt.content.find(x => x.catId === this.cat_ID).id,
                };
              });
            });
          });
        });
        break;
      case 3:
        this.step++;
        break;
      case 4:
        this.http.post('/api/requisition/createRequisition', {
          fields: this.data,
          name: 'Название услуги',
          serviceId: 1,
          status: 'ACCEPTED'
        }).subscribe(() => {
          alert('Заявка успешно подана');
          this.http.post('/api/fines/delete', {...this.contentsOutput.catId}).subscribe(() => {

          });
          this.router.navigate(['/']);
        });
    }
  }

  public prev(): void {
    this.step--;
  }

  public test(id): void {
    this.Next();
  }

}
