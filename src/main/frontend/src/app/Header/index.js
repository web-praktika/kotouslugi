import React, {Component} from 'react';
import mainIcon from "../../images/icons/128x128/cat_slippers.png";


export default class Header extends Component {

    render() {
        return (
            <div className="ui container" >
                <div className="ui grid" style={{paddingTop:10}}>
                    <div className="fifteen wide column">
                        <a href="/" className="header_padded" title={'Котуслуги: проще,чем мур мур мур!'}>
                            <img className="ui middle aligned mini image" src={mainIcon}/>
                            <span className="blue_cat">Кот</span><span className="red_cat">услуги</span>
                        </a>
                    </div>
                    <div className="one wide column">

                        <a href="/orders" >Заявки</a>
                    </div>


                </div>
            </div>
        )
    }
}