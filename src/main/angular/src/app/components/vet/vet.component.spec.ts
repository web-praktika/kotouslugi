import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VetComponent } from './vet.component';

describe('VetComponent', () => {
  let component: VetComponent;
  let fixture: ComponentFixture<VetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
