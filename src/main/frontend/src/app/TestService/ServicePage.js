import React, {Component} from 'react';
import Step from "./Step";

export default class TestServicePage
    extends Component {

    render() {
        return (
            <div className="">

                <Step activeStepNumber={1}/>

                <form className="ui form" action="/api/form/1">
                    <h4 className="ui dividing header">Персональная информация</h4>

                    <div className="two fields">
                        <div className="field">
                            <label>Кличка</label>
                            <input
                                type="text"
                                name="first-name"
                                placeholder="Кличка"
                                onChange={()=>{
                                    console.log(this);}}
                            />
                        </div>
                        <div className="field">
                            <label>Название породы</label>
                            <input type="text" name="last-name" placeholder="Название породы"/>
                        </div>
                    </div>

                    <div className="two fields">
                        <div className="field">
                            <label>Возраст</label>
                            <input type="text" name="age" placeholder="Возраст"/>
                        </div>

                        <div className="field">
                            <label>Пол</label>
                            <div className="inline fields radioGroupTop">
                                <div className="field">
                                    <div className="ui radio checkbox">
                                        <input
                                            type="radio"
                                            name="radioGroup"
                                        />
                                        <label>Choose this</label>
                                    </div>
                                </div>
                                <div className="field">
                                    <div className="ui radio checkbox">
                                        <input
                                            type="radio"
                                            name="radioGroup"
                                        />
                                        <label>Or that</label>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <h4 className="ui dividing header">Информация для связи</h4>
                    <div className="two fields">
                        <div className="field">
                            <label>Почта</label>
                            <input type="text" name="e-mail" placeholder="Почта"/>
                        </div>
                        <div className="field">
                            <label>Телефон</label>
                            <input type="text" name="phone" placeholder="Телефон"/>
                        </div>
                    </div>
                    <button className="ui icon right labeled button primary right floated" type='submit'>
                        Далее<i aria-hidden="true" className="right arrow icon"></i>
                    </button>
                </form>

            </div>
        )
    }
}