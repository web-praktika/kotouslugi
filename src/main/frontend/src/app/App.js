import React, {Component} from 'react';
import {hot} from 'react-hot-loader/root'
import {BrowserRouter as Router, Route} from "react-router-dom";
import "./style.css"

class App extends Component {
    render() {
        return (
            <div>
                <header className="header">
                    header
                </header>
                <main className="main">
                    <Router>
                        <Route path="/" exact render={() => <div>Тут услуги 12312</div>}/>
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