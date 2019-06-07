import React, {Component} from 'react';
import {Input} from 'semantic-ui-react'
import axios from "axios";
import loader from "../../images/loader.gif"
import CatalogCard from "./CatalogCard";
import CarouselPage from "./Carousel";

export default class CatalogPage extends Component {

    state = {
        data: [],
        filtered: []
    };

    componentDidMount() {
        // this.setState({services: listOfServices})
        this.getData()
    }

    getData = () => {
        axios.post('api/listService').then(({data}) => {
            this.setState({data: data.content, filtered: data.content})
        })
    };

    searchService = (val) => {
        const {data} = this.state;
        const value = val.value.toLowerCase();
        const filter = data.filter(item => {
            return item.name.toLowerCase().includes(value);
        });
        this.setState({filtered: filter})
    };

    render() {
        const {filtered} = this.state;
        return (
            <div>
                <div>
                    <Input
                        focus
                        placeholder='Поиск...'
                        icon='search'
                        fluid
                        onChange={(e, v) => this.searchService(v)}
                    />
                </div>

                <div className={"carousel-wrapper"}>
                    <CarouselPage/>
                </div>

                <div className={"ui header"}>
                    Каталог услуг
                </div>

                {filtered.length ?
                    <div className={"ui cards centered"}>
                        {filtered.map((service) => <CatalogCard service={service} key={service.id}/>)}
                    </div> :
                    <img className="ui centered medium image" alt={"картинка"} src={loader}/>
                }

            </div>
        )
    }
}