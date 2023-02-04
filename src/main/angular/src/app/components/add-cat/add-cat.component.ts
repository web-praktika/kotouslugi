import { Component, OnInit } from '@angular/core';
import { TestServiceService } from '../../services/test-service/test-service.service'
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-cat',
  templateUrl: './add-cat.component.html',
  styleUrls: ['./add-cat.component.scss']
})
export class AddCatComponent implements OnInit {

  public data: any;
  public ownersSurnames: any;
  public breeds: any;
  public catAddForm: FormGroup;
  public readonly steps = [{
                        id: 1,
                        icon: '/assets/svg/paw.svg',
                        title: 'Добавление котика',
                        description: 'Укажите необходимую информацию о котике'
                      }, {
                        id: 2,
                        icon: '/assets/svg/tasks.svg',
                        title: 'Подтверждение заявки',
                        description: 'Проверьте корректность заполнения данных'
                      }];
  public step = 1;

  constructor(
      private testService : TestServiceService,
      private router: Router,
      private formBuilder: FormBuilder,
      private http: HttpClient
  ) { }

  ngOnInit(): void {
        this.catAddForm = this.formBuilder.group({
          owner_ID: '',
          name: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/), Validators.minLength(2),Validators.maxLength(20)]),
          sex: 'Кот',
          breed: '',
          age: new FormControl('', [Validators.required, Validators.pattern(/^[\d]+$/), Validators.max(25)]),
          weight: new FormControl('', [Validators.required, Validators.pattern(/^[\d]+$/), Validators.max(22)]),
          vaccination_CERTIFICATE: 'Да',
        });
    this.http.get<any>('/api/breed/get').subscribe(dt => { this.breeds = dt.content; });
    this.http.get<any>('/api/createuser/get').subscribe(dt => { this.ownersSurnames = dt.content; });
  }
    public goToNextStep(): void {
        switch (this.step) {
          case 1:
            this.step++;
            this.data = {
              ...this.catAddForm.getRawValue(),
            };
            break;
          case 2:
            this.http.post('/api/createcat/save', {...this.data}).subscribe(() => {
              alert('Вы добавили котика!');
            })
            this.router.navigate(['/']);
            break;
        }
      }
          public prev(): void {
            this.step--;
          }

}
