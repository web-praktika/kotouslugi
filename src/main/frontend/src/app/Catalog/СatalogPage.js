import React, {Component} from 'react';
import {listOfServices} from './mock'
import catIcon from "../../images/icons/128x128/cat_box.png"
import {Link} from "react-router-dom";


export default class CatalogPage extends Component {

    state = {
        services: []
    };

    componentDidMount() {
        this.setState({services: listOfServices})
    }

    render() {

        return (
            <div>

                <div className={"ui header"}>
                    Каталог услуг
                </div>

                <div className={"ui cards"}>
                    {listOfServices.map((service) =>
                        <Link to={"/" + service.id } className="ui card" key={service.id}>
                            <div className="content">
                                <div className="ui mini left floated image"><img alt={"картинка"} src={catIcon}/></div>
                                <div className="header">{service.name}</div>
                                <div className="meta"><span className="date">Категория: Семья и дети</span></div>
                                <div className="description">{service.description}</div>
                            </div>
                            <div className="extra content">
                                <a><i aria-hidden="true" className="user icon"/>22 заявки</a>
                            </div>
                        </Link>)
                    }
                </div>

            </div>
        )
    }
}