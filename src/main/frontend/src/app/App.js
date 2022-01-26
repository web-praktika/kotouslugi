import React, {Component} from 'react';
import {hot} from 'react-hot-loader/root'
import {BrowserRouter as Router, Route, Switch} from "react-router-dom";
import CatalogPage from "./Catalog/СatalogPage";
import Page404 from "./404/404Page";
import TestServicePage from "./TestService/FormPage";
import TestServicePage_2 from "./TestService_2/FormPage";
import Header from "./Header";
import Breadcrumb from "./Breadcrumb";
import Footer from "./Footer";
import "./style.css"
import 'semantic-ui-css/semantic.min.css'
import 'react-responsive-carousel/lib/styles/carousel.min.css';
import OrdersListPage from "./OrdersList/OrdersListPage";

class App extends Component {

    state ={
        BreadcrumbLabel :  'Каталог услуг'
    };

    changeBreadcrumbLabel = (label) =>{
        this.setState({BreadcrumbLabel: label})
    };

    render() {

        return (
            <div className="mainWrapper">
                <Header/>
                <div className="ui divider"/>
                <Breadcrumb BreadcrumbLabel={this.state.BreadcrumbLabel}/>
                <div className="ui divider"/>
                <main className="ui container ">
                    <Router>
                        <Switch>
                            <Route path="/" exact component={CatalogPage}/>
                            <Route path="/2" exact render={() => (<TestServicePage changeBreadcrumbLabel={this.changeBreadcrumbLabel}/>)}/>
                            <Route path="/6" exact render={() => (<TestServicePage_2 changeBreadcrumbLabel={this.changeBreadcrumbLabel}/>)}/>
                            <Route path="/orders" exact render={() => (<OrdersListPage changeBreadcrumbLabel={this.changeBreadcrumbLabel}/>)}/>

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