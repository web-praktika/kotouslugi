import { ComponentFixture, TestBed } from '@angular/core/testing';

import { KotopravaComponent } from './kotoprava.component';

describe('KotopravaComponent', () => {
  let component: KotopravaComponent;
  let fixture: ComponentFixture<KotopravaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ KotopravaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(KotopravaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
