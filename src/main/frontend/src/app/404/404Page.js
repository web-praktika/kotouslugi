import React, {Component} from 'react';
import icon404 from "../../../public/static/images/404.png"


export default class Page404 extends Component {

    render() {
        const {location} = this.props;
        return (
            <div className="">
                <img className="ui centered medium image" alt={"картинка"} src={icon404}/>
                <h3 className="ui center aligned icon header">Ничего не знаю о "{location.pathname}" у меня лапки...</h3>
            </div>
        )
    }
}