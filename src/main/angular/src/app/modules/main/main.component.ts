import { Component, OnInit } from '@angular/core';
import { SliderItem } from '../../models/slider-item';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.scss']
})
export class MainComponent implements OnInit {

  public search = '';
  public sliderItems: SliderItem[] = [{
    image: '/assets/png/bnr1.png'
  }, {
    image: '/assets/png/bnr2.png'
  }, {
    image: '/assets/png/bnr3.png'
  }]

  constructor() { }

  ngOnInit(): void {
  }

}
