import React, {Component} from 'react';


export default class Breadcrumb extends Component {

    render() {
        const {BreadcrumbLabel} = this.props;
        return (
            <div className="ui container">
                <div className="ui breadcrumb">
                    <a className="section" href={'/'}>Главная</a>
                    <i className="right angle icon divider"/>
                    <a className="section">{BreadcrumbLabel}</a>
                </div>
            </div>
        )
    }
}