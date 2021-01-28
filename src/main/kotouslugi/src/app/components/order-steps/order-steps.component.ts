import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-order-steps',
  templateUrl: './order-steps.component.html',
  styleUrls: ['./order-steps.component.scss']
})
export class OrderStepsComponent implements OnInit {
  @Input() public steps: any = [];
  @Input() public active: number = 0;
  constructor() { }

  ngOnInit(): void {
  }

}
