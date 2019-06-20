import React, {Component} from 'react';
import mainIcon from "../../../public/static/images/icons/cat_slippers.png";


export default class Header extends Component {

    render() {
        return (
            <div className="ui container">
                <div className="ui grid" style={{paddingTop: 10}}>
                    <div className="fourteen wide column">
                        <a href="/" className="header_padded" title={'Котуслуги: проще,чем мур мур мур!'}>
                            <img alt="Кот" className="ui middle aligned mini image" src={mainIcon}/>
                            <span className="blue_cat">Кот</span><span className="red_cat">услуги</span>
                        </a>
                    </div>
                    <div className="middle aligned right aligned two wide column">
                        <a className="item" href="/orders">
                            Заявки <i aria-hidden="true" className="mail icon"/>
                        </a >
                    </div>
                </div>
            </div>
        )
    }
}