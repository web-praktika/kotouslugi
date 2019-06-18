import React, {Component} from 'react';

export default class FirstStepForm extends Component {

    render() {

        const {fields} = this.props;

        return (
            <div className="ui form">
                <h4 className="ui dividing header">Персональная информация</h4>

                <div className="two fields">
                    <div className="field">
                        <label>Кличка</label>
                        <input
                            type="text"
                            name="name"
                            placeholder="Кличка"
                            onChange={this.props.handleChange}
                            value={fields.name ? fields.name.value : undefined}
                        />
                    </div>
                    <div className="field">
                        <label>Название породы</label>
                        <input
                            type="text"
                            name="lastName"
                            placeholder="Название породы"
                            onChange={this.props.handleChange}
                            value={fields.lastName ? fields.lastName.value : undefined}
                        />
                    </div>
                </div>

                <div className="two fields">
                    <div className="field">
                        <label>Возраст</label>
                        <input
                            type="text"
                            name="age"
                            placeholder="Возраст"
                            onChange={this.props.handleChange}
                            value={fields.age ? fields.age.value : undefined}
                        />
                    </div>

                    <div className="field">
                        <label>Пол</label>
                        <div className="inline fields radioGroupTop">
                            <div className="field">
                                <div className="ui radio checkbox">
                                    <input
                                        type="radio"
                                        name="sex"
                                        onChange={this.props.handleChange}
                                        // defaultChecked={true}
                                        placeholder="Пол"
                                        value='male'
                                        checked={fields.sex ? fields.sex.value === 'male' : true }
                                    />
                                    <label>Кот</label>
                                </div>
                            </div>
                            <div className="field">
                                <div className="ui radio checkbox">
                                    <input
                                        type="radio"
                                        name="sex"
                                        onChange={this.props.handleChange}
                                        value={'female'}
                                        checked={fields.sex ? fields.sex.value === 'female' : false }
                                        placeholder="Пол"
                                    />
                                    <label>Кошка</label>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <h4 className="ui dividing header">Информация для связи</h4>
                <div className="two fields">
                    <div className="field">
                        <label>Почта</label>
                        <input
                            type="text"
                            name="email"
                            placeholder="Почта"
                            onChange={this.props.handleChange}
                            value={fields.email ? fields.email.value : undefined}
                        />
                    </div>
                    <div className="field">
                        <label>Телефон</label>
                        <input
                            type="text"
                            name="phone"
                            placeholder="Телефон"
                            onChange={this.props.handleChange}
                            value={fields.phone ? fields.phone.value : undefined}
                        />
                    </div>
                </div>
                <button className="ui icon right labeled button primary right floated" onClick={this.props.changeStepNext}>
                    Далее<i aria-hidden="true" className="right arrow icon"></i>
                </button>
            </div>
        )
    }
}