import React, {Component} from 'react';
import {hot} from 'react-hot-loader/root'
import {BrowserRouter as Router, Route, Switch} from "react-router-dom";
import CatalogPage from "./Catalog/СatalogPage";
import Page404 from "./404/404Page";
import TestServicePage from "./TestService/ServicePage";
import Header from "./Header";
import Breadcrumb from "./Breadcrumb";
import Footer from "./Footer";
import "./style.css"
import 'semantic-ui-css/semantic.min.css'

class App extends Component {
    render() {
        return (
            <div>
                <Header/>
                <div className="ui divider"/>
                <Breadcrumb/>
                <div className="ui divider"/>
                <main className="ui container ">
                    <Router>
                        <Switch>
                            <Route path="/" exact component={CatalogPage}/>
                            <Route path="/1" exact component={TestServicePage}/>
                            <Route component={Page404}/>
                        </Switch>
                    </Router>
                </main>
                <Footer/>
            </div>
        )
    }
}

export default process.env.NODE_ENV === 'production' ? App : hot(App)