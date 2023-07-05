import { TestBed } from '@angular/core/testing';

import { ArrayOperationsService } from './array-operations.service';

describe('ArrayOperationsService', () => {
  let service: ArrayOperationsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ArrayOperationsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
