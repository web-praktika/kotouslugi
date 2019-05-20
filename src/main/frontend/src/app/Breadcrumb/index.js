import React, {Component} from 'react';


export default class Breadcrumb extends Component {

    render() {
        return (
            <div className="ui container">
                <div className="ui breadcrumb">
                    <a className="section" href={'/'}>Главная</a>
                    <i className="right angle icon divider"/>
                    <a className="section">Каталог услуг</a>
                </div>
            </div>
        )
    }
}