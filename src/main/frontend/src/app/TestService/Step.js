import React, {Component} from 'react';

export default class Step
    extends Component {

    render() {
        return(
            <div className="ui steps">
                <div className="completed step">
                    <i className="truck icon"/>
                    <div className="content">
                        <div className="title">Информация о пациенте</div>
                        <div className="description">Укажите необходимую информацию о пациенте</div>
                    </div>
                </div>
                <div className="completed step">
                    <i className="credit card icon"/>
                    <div className="content">
                        <div className="title">Выбор специалиста</div>
                        <div className="description">Укажите название клиники и специалиста</div>
                    </div>
                </div>
                <div className="active step">
                    <i className="info icon"/>
                    <div className="content">
                        <div className="title">Подтверждение заявки</div>
                        <div className="description">Проверьте кооректность заполнения заявления</div>
                    </div>
                </div>
            </div>
        )
    }
}