import React, {Component} from 'react';

export default class ThirdStepForm extends Component {

    render() {
        const {fields} = this.props;

        return (
            <div>
                <h4 className="ui dividing header">Подтверждение заявки</h4>
                <table className="ui celled table">
                    <tbody>

                    {Object.values(fields).map((item) =>
                        <tr key={item.label + item.value}>
                            <td>{item.label}</td>
                            <td>{item.value}</td>
                        </tr>
                    )}

                    </tbody>
                </table>
                <button
                    className="ui button primary right floated"
                    onClick={this.props.submitForm}
                >
                    Отправить
                </button>
                <button
                    className="ui icon left labeled button primary left floated"
                    onClick={this.props.changeStepPrev}
                >
                    <i aria-hidden="true" className="left arrow icon"></i>Назад
                </button>
            </div>

        )
    }
}