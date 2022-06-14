import { Component, Input, OnInit } from '@angular/core';
import { SliderItem } from '../../../../models/slider-item';

@Component({
  selector: 'app-slider',
  templateUrl: './slider.component.html',
  styleUrls: ['./slider.component.scss']
})
export class SliderComponent implements OnInit {

  private currentIndex: number;
  @Input() public items: SliderItem[];

  constructor() {
  }

  public get current(): number {
    return this.currentIndex;
  }

  public set current(input: number) {
    this.currentIndex = input >= this.items.length ? 0 :
      input < 0 ? this.items.length - 1 : input;
  }

  ngOnInit(): void {
    this.current = 0;
  }

}
