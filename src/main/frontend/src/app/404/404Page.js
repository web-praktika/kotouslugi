import React, {Component} from 'react';

export default class Page404 extends Component {

    render() {
        const {location} = this.props;
        return (
            <div>Ничего не знаю о "{location.pathname}" у меня лапки...</div>
        )
    }
}