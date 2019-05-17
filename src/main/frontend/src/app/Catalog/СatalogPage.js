import React, {Component} from 'react';
import {listOfServices} from './mock'
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

                <div className={"catalog_header"}>
                    Каталог услуг
                </div>

                <div className={"catalog_container"}>
                    {listOfServices.map((service) =>
                        <div key={service.id} className={"service_block"}>
                            <Link to={"/" + service.id}>{service.name}</Link>
                        </div>)
                    }
                </div>

            </div>
        )
    }
}