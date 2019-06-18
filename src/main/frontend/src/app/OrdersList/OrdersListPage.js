import React, {Component} from 'react';
import axios from "axios";

export default class OrdersListPage extends Component {

    state = {
        data: []
    };

    componentDidMount() {
        axios.post('/api/requisition/listRequisition').then(({data}) => {
            this.setState({data: data.content})
        })
    }

    render() {
        const {data} = this.state;
        return(
            <div>
                <h4 className="ui dividing header">Список заявок</h4>
                <table className="ui celled table">
                    <tbody>

                    {data.map((item) =>
                        <tr key={item.id + item.status}>
                            <td>{item.id}</td>
                            <td>{item.name}</td>
                            <td>{item.status}</td>
                            <td>{item.fields}</td>
                        </tr>
                    )}

                    </tbody>
                </table>
            </div>
        )
    }
}
