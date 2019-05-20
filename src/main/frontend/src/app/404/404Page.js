import React, {Component} from 'react';
import icon404 from "../../images/icons/404.png"


export default class Page404 extends Component {

    render() {
        const {location} = this.props;
        return (
            <div className="">
                <img className="ui middle aligned medium image" alt={"картинка"} src={icon404}/>
                <span>Ничего не знаю о "{location.pathname}" у меня лапки...</span>
            </div>
        )
    }
}