import { Component, OnInit } from "@angular/core";
import {
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from "@angular/forms";
import { Router, ActivatedRoute } from "@angular/router";
import { PassportServiceService } from "src/app/services/passport-service/passport-service.service";
import { Passport } from "src/app/models/Passport";
import { HttpClient } from "@angular/common/http";

@Component({
  selector: "app-create-passport",
  templateUrl: "./create-passport.component.html",
  styleUrls: ["./create-passport.component.scss"],
})
export class CreatePassportComponent implements OnInit {
  public passportForm: FormGroup;
  public serviceType: string;
  public passport: Passport;
  public readonly id = Number(this.activatedRoute.snapshot.paramMap.get("id"));
  public registered_cats: Passport;
  public readonly steps = [
    {
      id: 1,
      icon: "/assets/svg/paw.svg",
      title: "Выбор услуги",
      description: "Выберите какую услугу вы хотите получить",
    },
    {
      id: 2,
      icon: "/assets/svg/tasks.svg",
      title: "Заполнение данных",
      description: "Укажите необходимую информацию о котике",
    },
    {
      id: 3,
      icon: "/assets/svg/tasks.svg",
      title: "Проверка информации",
      description: "Проверьте корректность заполненных данных",
    },
  ];
  public step = 1;

  constructor(
    private passportService: PassportServiceService,
    private router: Router,
    private fb: FormBuilder,
    private activatedRoute: ActivatedRoute,
    private http: HttpClient
  ) {}

  ngOnInit(): void {
    this.passportForm = this.fb.group({
      name: new FormControl("", [
        Validators.required,
        Validators.pattern(/^[А-яЁё]+$/),
      ]),
      sex: "male",
      breed: new FormControl("", [
        Validators.required,
        Validators.pattern(/^[А-яЁё]+$/),
      ]),
      cat_COLOR: new FormControl("", [
        Validators.required,
        Validators.pattern(/^[А-яЁё]+$/),
      ]),
      photo: "",
      father: new FormControl("", [
        Validators.required,
        Validators.pattern(/^[А-яЁё]+$/),
      ]),
      mother: new FormControl("", [
        Validators.required,
        Validators.pattern(/^[А-яЁё]+$/),
      ]),
      reason_FOR_REPLACEMENT:
        "Достижение 14-летнего возраста по кошачьим годам",
        marital_STATUS: "Не состою в браке",
    });
  }
  public handleServiceTypeGet(): void {
    this.serviceType = "get";
    this.next();
  }
  public handleServiceTypeReplacement(): void {
    this.serviceType = "replacement";
    this.next();
  }
  public next(): void {
    switch (this.step) {
      case 1:
        this.step++;
        break;
      case 2:
        this.step++;
        this.passport = this.passportForm.getRawValue();

        if (this.serviceType === "replacement") {
          this.passport.sex = "Не изменён";
          this.passport.breed = "Не изменена";
          this.passport.cat_COLOR = "Не изменён";
          this.passport.father = "Не изменён";
          this.passport.mother = "Не изменён";
        }
        break;
      case 3:
        this.http.post('/api/requisition/createRequisition', {
          fields: this.passport,
          name: 'Получение/замена паспорта',
          serviceId: 440,
          status: 'ACCEPTED'
        }).subscribe(() => {
          this.router.navigate(['/']);
        });
        this.http
          .post("/api/create_passport/s1/save", {
            ...this.passport,
          })
          .subscribe(() => {
            if (this.serviceType == "get") {
              alert("Заявка на оформление паспорта успешно принята");
            } else if (this.serviceType == "replacement") {
              alert("Заявка на замену паспорта успешно принята");
            }
            this.router.navigate(["/"]);
          });
        break;
    }
  }

  public prev(): void {
    this.step--;
  }

  public saveData(): void {
    const data = {
      name: "",
      age: "",
    };
    //this.passportService.saveService(data).subscribe((res)=> {
    //});
    this.router.navigate(["/"]);
  }
}
