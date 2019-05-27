import React, {Component} from 'react';


const steps = [
    {
        name: 'Информация о пациенте',
        description: 'Укажите необходимую информацию о пациенте',
        icon: 'paw icon'
    },
    {
        name: 'Выбор специалиста',
        description: 'Укажите специалиста и время приема',
        icon: 'hospital icon'
    },
    {
        name: 'Подтверждение заявки',
        description: 'Проверьте кооректность заполнения заявки',
        icon: 'tasks icon'
    },
];


export default class Stepper extends Component {

    render() {
        const {activeStepNumber} = this.props;

        return (
            <div className="ui steps">
                {steps.map((item, i) => {
                        return (
                            <div key={item.name + i}
                                 className={i === activeStepNumber ? "active step" : i > activeStepNumber ? "disabled step" : "completed step"}>
                                <i className={item.icon}/>
                                <div className="content">
                                    <div className="title">{item.name}</div>
                                    <div className="description">{item.description}</div>
                                </div>
                            </div>
                        )
                    }
                )
                }
            </div>
        )
    }
}