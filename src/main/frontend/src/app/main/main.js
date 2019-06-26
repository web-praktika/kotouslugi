import React, {Component} from 'react';
import  axios from "axios";

export default class Main extends  Component {

    state={
        serviceList:[]
    };

    getServicelist = () =>{

        axios.post('/api/listService')
            .then((response)=>{this.setState({serviceList: response.data.content})})
            .catch((error)=>{console.log(error);})
        };


    componentDidMount() {
        this.getServicelist()
    }
//
    render(){
        return (<div className="ui three cards"><!-- xexxe-->

            {this.state.serviceList.map((item) => {
            return <div className="ui card" key={item.id}>{item.name}</div>
        })}</div>)
    }
}