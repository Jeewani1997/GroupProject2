import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WasterequestComponent } from './wasterequest.component';

describe('WasterequestComponent', () => {
  let component: WasterequestComponent;
  let fixture: ComponentFixture<WasterequestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WasterequestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WasterequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
