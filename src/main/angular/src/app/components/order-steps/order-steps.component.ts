import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-order-steps',
  templateUrl: './order-steps.component.html',
  styleUrls: ['./order-steps.component.scss']
})
export class OrderStepsComponent implements OnInit {

  @Input() public steps = [];
  @Input() public active: number;

  constructor() { }

  ngOnInit() {
  }

}
