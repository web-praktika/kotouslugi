import React, {Component} from 'react';
import {listOfServices} from './mock'
import catIcon from "../../images/icons/128x128/cat_box.png"
import {Link} from "react-router-dom";
import { Input } from 'semantic-ui-react'


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
                <div>
                    <Input
                        focus
                        placeholder='Поиск...'
                        icon='search'
                        fluid
                    />
                </div>

                <div className={"ui header"}>
                    Каталог услуг
                </div>

                <div className={"ui cards centered"}>
                    {listOfServices.map((service) =>
                        <Link to={"/" + service.id } className="ui card" key={service.id}>
                            <div className="content">
                                <div className="ui mini left floated image"><img alt={"картинка"} src={catIcon}/></div>
                                <div className="header">{service.name}</div>
                                <div className="meta"><span className="date">Категория: Семья и дети</span></div>
                                <div className="description">{service.description}</div>
                            </div>
                        </Link>)
                    }
                </div>

            </div>
        )
    }
}