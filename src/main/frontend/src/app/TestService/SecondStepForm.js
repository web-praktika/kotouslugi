import React, {Component} from 'react';

export default class SecondStepForm extends Component {

    render() {
        return (
            <div>
                <form className="ui form" onSubmit={this.props.submitForm}>
                    <h4 className="ui dividing header">Персональная информация</h4>

                    <div className="two fields">
                        <div className="field">
                            <label>Кличка</label>
                            <input
                                type="text"
                                name="doctorName"
                                placeholder="ФИО ветеринара"
                                onChange={this.props.handleChange}
                            />
                        </div>
                        <div className="field">
                            <label>Время приема</label>
                            <select
                                name="time"
                                onChange={this.props.handleChange}
                            >
                                <option value="male">10:00
                                </option
                                >
                                <option value="female">11:00</option>
                            </select>
                        </div>
                    </div>

                    <button className="ui icon right labeled button primary right floated" type='submit'>
                        Далее<i aria-hidden="true" className="right arrow icon"></i>
                    </button>
                    <button className="ui icon left labeled button primary left floated">
                        <i aria-hidden="true" className="left arrow icon"></i>Назад
                    </button>
                </form>
            </div>
        )
    }
}