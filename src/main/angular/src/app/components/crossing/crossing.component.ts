import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-crossing',
  templateUrl: './crossing.component.html',
  styleUrls: ['./crossing.component.scss']
})
export class CrossingComponent implements OnInit {

    public petForm: FormGroup;
    public crossingForm: FormGroup;
    public data: any;
    public readonly steps = [{
      id: 1,
      icon: '/assets/svg/paw.svg',
      title: 'Информация о пациенте',
      description: 'Укажите необходимую информацию о пациенте'
    }, {
      id: 2,
      icon: '/assets/svg/hospital.svg',
      title: 'Выбор специалиста',
      description: 'Укажите специалиста и время приема'
    }, {
      id: 3,
      icon: '/assets/svg/tasks.svg',
      title: 'Подтверждение заявки',
      description: 'Проверьте корректность заполнения заявки'
    }];
    public step = 1;


  constructor(

    private fb: FormBuilder
  ) { }

  ngOnInit(): void {
    this.petForm = this.fb.group({
      HumanName: '',
      HumanAge: '',
      number: '',
      mail: ''
    });
 this.crossingForm = this.fb.group({
      name: '',
      lastName: '',
      sex: 'male',
      age: '',
      weight: '',
      color: ''
    });
  }
   public next(): void {
    switch (this.step) {
      case 1:
        this.step++;
        break;
      case 2:
        this.step++;
        this.data = {
          ...this.petForm.getRawValue(),
          ...this.crossingForm.getRawValue()
        };
        break;

    }
  }

  public prev(): void {
    this.step--;
  }
}
