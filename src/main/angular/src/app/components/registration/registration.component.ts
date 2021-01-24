import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Cat } from '../../models/cat';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
export class RegistrationComponent implements OnInit {

  public petForm: FormGroup;
  public cat: Cat;
  public readonly id = Number(this.activatedRoute.snapshot.paramMap.get('id'));
  public readonly steps = [{
    id: 1,
    icon: '/assets/svg/paw.svg',
    title: 'Информация о котике',
    description: 'Укажите необходимую информацию о котике'
  }, {
    id: 2,
    icon: '/assets/svg/tasks.svg',
    title: 'Проверка информации',
    description: 'Проверьте корректность заполнения заявки'
  }];
  public step = 1;

  constructor(
    private router: Router,
    private activatedRoute: ActivatedRoute,
    private fb: FormBuilder,
    private http: HttpClient
  ) { }

  ngOnInit(): void {

    this.petForm = this.fb.group({
      gender: 'M',
      name: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/)]),
      breed: new FormControl('', [Validators.required, Validators.pattern(/^[А-яЁё]+$/)]),
      age: new FormControl('', [Validators.required, Validators.pattern(/^[\d]+$/)])
    });

    if (this.id) {
      this.http.get(`/api/cat/getCat?id=${this.id}`).subscribe((data: Cat) => {
        this.petForm.setValue(data);
      })
    }
  }

  public next(): void {
    switch (this.step) {
      case 1:
        this.step++;
        this.cat = this.petForm.getRawValue();

        if (this.id) {
          this.cat.id = this.id;
        }

        break;
      case 2:
        this.http.post('/api/cat/setCat', {
          ...this.cat,
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

}
