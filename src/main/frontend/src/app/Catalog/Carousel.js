import React, {Component} from 'react';
import {Carousel} from "react-responsive-carousel";
import photo1 from "../../images/photo1.jpg";
import photo2 from "../../images/photo2.jpg";
import "../style.css";

export default class CarouselPage extends Component {
    render() {
        return (
            <Carousel showArrows={true} autoPlay={true} interval={5000} width={1127} showThumbs={false}>
                <div>
                    <img src={photo1} />
                </div>
                <div>
                    <img src={photo2} />
                </div>
            </Carousel>
        );
    }
};
