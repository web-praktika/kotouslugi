import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CatcomponentComponent } from './catcomponent.component';

describe('CatcomponentComponent', () => {
  let component: CatcomponentComponent;
  let fixture: ComponentFixture<CatcomponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CatcomponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CatcomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
