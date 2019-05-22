import React, {Component} from 'react';
import {Link} from "react-router-dom";
import {icons} from "./constants";


export default class CatalogCard extends Component {

    render() {
        const {service} = this.props;
        return (
            <Link to={"/" + service.id} className="ui card" >
                <div className="content">
                    <div className="ui mini left floated image">
                        <img alt={"картинка"} src={icons[service.id]}/>
                    </div>
                    <div className="header">{service.name}</div>
                    <div className="meta"><span className="date">{service.categories.map((item)=> {return item.name}).join(',')}</span></div>
                    <div className="description">{service.description}</div>
                </div>
            </Link>
        )
    }
}