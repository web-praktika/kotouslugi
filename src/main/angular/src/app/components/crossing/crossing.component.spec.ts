import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { CrossingComponent } from './crossing.component';

describe('CrossingComponent', () => {
  let component: CrossingComponent;
  let fixture: ComponentFixture<CrossingComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ CrossingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CrossingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
