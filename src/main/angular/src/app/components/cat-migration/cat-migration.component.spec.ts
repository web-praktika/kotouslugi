import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CatMigrationComponent } from './cat-migration.component';

describe('CatMigrationComponent', () => {
  let component: CatMigrationComponent;
  let fixture: ComponentFixture<CatMigrationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CatMigrationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CatMigrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
