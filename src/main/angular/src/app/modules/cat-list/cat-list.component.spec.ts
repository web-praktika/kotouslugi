import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CatListComponent } from './cat-list.component';

describe('CatListComponent', () => {
  let component: CatListComponent;
  let fixture: ComponentFixture<CatListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CatListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CatListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
