import { TestBed } from '@angular/core/testing';

import { SendPostComponentService } from './send-post-component.service';

describe('SendPostComponentService', () => {
  let service: SendPostComponentService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SendPostComponentService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
