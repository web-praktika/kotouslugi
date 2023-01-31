import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatePassportComponent } from './create-passport.component';

describe('CreatePassportComponent', () => {
  let component: CreatePassportComponent;
  let fixture: ComponentFixture<CreatePassportComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreatePassportComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreatePassportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
