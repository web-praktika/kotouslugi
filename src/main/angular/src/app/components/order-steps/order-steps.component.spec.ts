import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { OrderStepsComponent } from './order-steps.component';

describe('OrderStepsComponent', () => {
  let component: OrderStepsComponent;
  let fixture: ComponentFixture<OrderStepsComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ OrderStepsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OrderStepsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
