import React, {Component} from 'react';
import {icons, listOfServices} from './constants'
import {Link} from "react-router-dom";
import {Input} from 'semantic-ui-react'
import axios from "axios";


export default class CatalogPage extends Component {

    state = {
        services: []
    };

    componentDidMount() {
        // this.setState({services: listOfServices})
        this.getData()
    }

    getData = () => {
        axios.post('api/listService').then(({data}) => {
            this.setState({services: data.content})
        })
    };

    render() {
        const {services} = this.state;
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
                    {services.map((service) =>
                        <Link to={"/" + service.id} className="ui card" key={service.id}>
                            <div className="content">
                                <div className="ui mini left floated image">
                                    <img alt={"картинка"} src={icons[service.id]}/>
                                </div>
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