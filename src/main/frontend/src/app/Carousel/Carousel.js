import React, {Component} from 'react';
import photo1 from "../../../public/static/images/photo1.png";
import photo2 from "../../../public/static/images/photo2.png";
import "../style.css";
import {Carousel} from "react-responsive-carousel";

export default class CarouselPage extends Component {
    render() {
        return (
            <Carousel
                showArrows={true}
                autoPlay={true}
                interval={5000}
                style={{width: 1127}}
                showThumbs={false}
                showStatus={false}
                className={"mainCarousel"}
                infiniteLoop={true}
            >
                <div>
                    <img alt="реклама" src={photo1}/>
                </div>
                <div>
                    <img alt="реклама" src={photo2}/>
                </div>
            </Carousel>
        );
    }
};
