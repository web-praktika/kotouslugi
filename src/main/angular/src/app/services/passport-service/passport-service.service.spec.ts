import { TestBed } from '@angular/core/testing';

import { PassportServiceService } from './passport-service.service';

describe('PassportServiceService', () => {
  let service: PassportServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PassportServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
