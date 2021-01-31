import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup} from "@angular/forms";
import {Cat} from "../../models/cat";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
export class RegistrationComponent implements OnInit {

  public petForm: FormGroup;
  public cat: Cat | undefined;
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
  constructor(private fb: FormBuilder, private http: HttpClient) {
    this.petForm = this.fb.group({
      name: new FormControl(''),
      age: new FormControl('')
    });
  }

  ngOnInit(): void {
  }

  public next(): void{
    switch(this.step){
      case 1:
        this.step++;
        this.cat = this.petForm.getRawValue() as Cat;
        break;
      case 2:
        this.http.post('catService/addCat', {
          name:this.cat?.name,
          age:this.cat?.age
        }).subscribe(() =>{
          alert('Котик успешно зарегистрирован');
        })
        break;
    }
  }

  public prev(): void{
    this.step--;
  }
}
