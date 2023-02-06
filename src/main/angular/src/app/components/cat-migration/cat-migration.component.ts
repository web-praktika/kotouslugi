import { Component, OnInit } from '@angular/core';
import { TestServiceService } from '../../services/test-service/test-service.service'
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-cat-migration',
  templateUrl: './cat-migration.component.html',
  styleUrls: ['./cat-migration.component.scss']
})
export class CatMigrationComponent implements OnInit {

  public data: any;
  public ownersSurnames: any;
  public Cats: any;
  public breeds: any;
  public catMigrationForm: FormGroup;

  public outputSender = "";
  public outputRecipient = "";

  public readonly steps = [{
    id: 1,
    icon: '/assets/svg/paw.svg',
    title: 'Миграция котика',
    description: 'Попрощайтесь с ним как следует'
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
    this.catMigrationForm = this.formBuilder.group({
      sender_ID: '',
      recipient_ID: '',
      cat_ID: '',
      timeMessage: 'Постоянная',
    });
    this.http.get<any>('/api/breed/get').subscribe(dt => { this.breeds = dt.content; });
    this.http.get<any>('/api/createuser/get').subscribe(dt => { this.ownersSurnames = dt.content; });
    this.http.get<any>('/api/createcat/get').subscribe(dt => { this.Cats = dt.content; });
  }

  public goToNextStep(): void {
    switch (this.step) {
      case 1:
        this.step++;
        this.data = {
          owner_ID: this.catMigrationForm.get('recipient_ID').value,
          cat_ID: this.catMigrationForm.get('cat_ID').value,
          name: this.Cats.find(x=> x.owner_ID == this.catMigrationForm.get('sender_ID').value).name,
          sex: this.Cats.find(x=> x.owner_ID == this.catMigrationForm.get('sender_ID').value).sex,
          breed: this.Cats.find(x=> x.owner_ID == this.catMigrationForm.get('sender_ID').value).breed,
          age: this.Cats.find(x=> x.owner_ID == this.catMigrationForm.get('sender_ID').value).age,
          weight: this.Cats.find(x=> x.owner_ID == this.catMigrationForm.get('sender_ID').value).weight,
          vaccination_CERTIFICATE: this.Cats.find(x=> x.owner_ID == this.catMigrationForm.get('sender_ID').value).vaccination_CERTIFICATE,
        };
        this.outputSender = this.ownersSurnames.find(x => x.id == this.catMigrationForm.get('sender_ID').value).surname + " "
        + this.ownersSurnames.find(x => x.id == this.catMigrationForm.get('sender_ID').value).surname + " "
        + this.ownersSurnames.find(x => x.id == this.catMigrationForm.get('sender_ID').value).middle_NAME;
        this.outputRecipient = this.ownersSurnames.find(x => x.id == this.catMigrationForm.get('recipient_ID').value).surname + " "
          + this.ownersSurnames.find(x => x.id == this.catMigrationForm.get('recipient_ID').value).surname + " "
          + this.ownersSurnames.find(x => x.id == this.catMigrationForm.get('recipient_ID').value).middle_NAME;
        break;
      case 2:
        var currentDate: Date;
        currentDate = new Date();
        new Date().toLocaleString();
        this.http.post('/api/requisition/createRequisition', {
          fields: this.data,
          name: 'Название услуги',
          serviceId: 8,
          status: 'ACCEPTED',
          time: new Date().toLocaleString(),
          desc: this.catMigrationForm.get('timeMessage').value
        }).subscribe(() => {
          this.http.post('/api/createcat/update', {...this.data}).subscribe(() => {
            alert('Обновлено!');
          })
          alert('Заявка успешно подана');
          this.router.navigate(['/']);
        });
        break;
    }
  }
  public prev(): void {
    this.step--;
  }

}
