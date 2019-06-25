import React, {Component} from 'react';
import {hot} from 'react-hot-loader/root'
import "./style.css"

class App extends Component {

    render() {
        return <div>Тест</div>
    }
}

export default process.env.NODE_ENV === 'production' ? App : hot(App)