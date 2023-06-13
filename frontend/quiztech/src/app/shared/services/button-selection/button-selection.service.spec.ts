import { TestBed } from '@angular/core/testing';

import { ButtonSelectionService } from './button-selection.service';

describe('ButtonSelectionService', () => {
  let service: ButtonSelectionService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ButtonSelectionService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
