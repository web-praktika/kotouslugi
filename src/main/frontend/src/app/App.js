import React, {Component} from 'react';
import {hot} from 'react-hot-loader/root'
import "./style.css"
import Header from "./header/header";
import Main from "./main/main";
import Footer from "./footer/footer";
import "semantic-ui-css/semantic.min.css"

class App extends Component {

    render() {
        return <div> <Header/> <Main/> <Footer/> </div>
    }
}

export default process.env.NODE_ENV === 'production' ? App : hot(App)