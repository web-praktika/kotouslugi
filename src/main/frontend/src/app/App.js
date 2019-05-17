import React, {Component} from 'react';
import {hot} from 'react-hot-loader/root'
import {BrowserRouter as Router, Route, Switch} from "react-router-dom";
import "./style.css"
import CatalogPage from "./Catalog/СatalogPage";
import Page404 from "./404/404Page";
import TestServicePage from "./TestService/ServicePage";

class App extends Component {
    render() {
        return (
            <div>
                <header className="header">
                    header
                </header>
                <main className="main">
                    <Router>
                        <Switch>
                            <Route path="/" exact component={CatalogPage}/>
                            <Route path="/1" exact component={TestServicePage}/>
                            <Route component={Page404}/>
                        </Switch>
                    </Router>
                </main>
                <footer className="footer">
                    footer
                </footer>
            </div>
        )
    }
}

export default process.env.NODE_ENV === 'production' ? App : hot(App)