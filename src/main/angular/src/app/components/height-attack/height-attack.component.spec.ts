import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeightAttackComponent } from './height-attack.component';

describe('HeightAttackComponent', () => {
  let component: HeightAttackComponent;
  let fixture: ComponentFixture<HeightAttackComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeightAttackComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HeightAttackComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
