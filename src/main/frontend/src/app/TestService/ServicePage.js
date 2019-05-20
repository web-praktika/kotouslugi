import React, {Component} from 'react';

export default class TestServicePage
    extends Component {

    render() {
        return (
            <div className="ui grid">
                <div className="row">
                    <div className="five wide column">
                        <div className="ui vertical steps">
                            <div className="completed step">
                                <i className="truck icon"/>
                                <div className="content">
                                    <div className="title">Shipping</div>
                                    <div className="description">Choose your shipping options</div>
                                </div>
                            </div>
                            <div className="completed step">
                                <i className="credit card icon"/>
                                <div className="content">
                                    <div className="title">Billing</div>
                                    <div className="description">Enter billing information</div>
                                </div>
                            </div>
                            <div className="active step">
                                <i className="info icon"/>
                                <div className="content">
                                    <div className="title">Confirm Order</div>
                                    <div className="description">Verify order details</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div className="eleven wide wide column">
                        <form className="ui form">
                            <h4 className="ui dividing header">Shipping Information</h4>
                            <div className="field">
                                <label>Name</label>
                                <div className="two fields">
                                    <div className="field">
                                        <input type="text" name="shipping[first-name]" placeholder="First Name"/>
                                    </div>
                                    <div className="field">
                                        <input type="text" name="shipping[last-name]" placeholder="Last Name"/>
                                    </div>
                                </div>
                            </div>
                            <div className="field">
                                <label>Billing Address</label>
                                <div className="fields">
                                    <div className="twelve wide field">
                                        <input type="text" name="shipping[address]" placeholder="Street Address"/>
                                    </div>
                                    <div className="four wide field">
                                        <input type="text" name="shipping[address-2]" placeholder="Apt #"/>
                                    </div>
                                </div>
                            </div>
                            <div className="two fields">
                                <div className="field">
                                    <label>State</label>
                                    <select className="ui fluid dropdown">
                                        <option value="">State</option>
                                        <option value="AL">Alabama</option>
                                    </select>
                                </div>
                                <div className="field">
                                    <label>Country</label>
                                    <div className="ui fluid search selection dropdown">
                                        <input type="hidden" name="country"/>
                                        <i className="dropdown icon"/>
                                        <div className="default text">Select Country</div>
                                        <div className="menu">

                                            <div className="item" data-value="ro"><i className="ro flag"/>Romania
                                            </div>
                                            <div className="item" data-value="ru"><i className="ru flag"/>Russia
                                            </div>
                                            <div className="item" data-value="rw"><i className="rw flag"/>Rwanda
                                            </div>
                                            <div className="item" data-value="sh"><i className="sh flag"/>Saint

                                            </div>

                                        </div>
                                    </div>
                                </div>
                            </div>
                            <h4 className="ui dividing header">Billing Information</h4>
                            <div className="field">
                                <label>Card Type</label>
                                <div className="ui selection dropdown">
                                    <input type="hidden" name="card[type]"/>
                                    <div className="default text">Type</div>
                                    <i className="dropdown icon"/>
                                    <div className="menu">
                                        <div className="item" data-value="visa">
                                            <i className="visa icon"/>
                                            Visa
                                        </div>
                                        <div className="item" data-value="amex">
                                            <i className="amex icon"/>
                                            American Express
                                        </div>
                                        <div className="item" data-value="discover">
                                            <i className="discover icon"/>
                                            Discover
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div className="fields">
                                <div className="seven wide field">
                                    <label>Card Number</label>
                                    <input type="text" name="card[number]" maxLength="16" placeholder="Card #"/>
                                </div>
                                <div className="three wide field">
                                    <label>CVC</label>
                                    <input type="text" name="card[cvc]" maxLength="3" placeholder="CVC"/>
                                </div>
                                <div className="six wide field">
                                    <label>Expiration</label>
                                    <div className="two fields">
                                        <div className="field">
                                            <select className="ui fluid search dropdown" name="card[expire-month]">
                                                <option value="">Month</option>
                                                <option value="1">January</option>
                                                <option value="2">February</option>
                                                <option value="3">March</option>
                                                <option value="4">April</option>
                                                <option value="5">May</option>
                                                <option value="6">June</option>
                                                <option value="7">July</option>
                                                <option value="8">August</option>
                                                <option value="9">September</option>
                                                <option value="10">October</option>
                                                <option value="11">November</option>
                                                <option value="12">December</option>
                                            </select>
                                        </div>
                                        <div className="field">
                                            <input type="text" name="card[expire-year]" maxLength="4"
                                                   placeholder="Year"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <h4 className="ui dividing header">Receipt</h4>
                            <div className="field">
                                <label>Send Receipt To:</label>
                                <div className="ui fluid multiple search selection dropdown">
                                    <input type="hidden" name="receipt"/>
                                    <i className="dropdown icon"/>
                                    <div className="default text">Saved Contacts</div>
                                    <div className="menu">
                                        <div className="item" data-value="jenny" data-text="Jenny">
                                            <img className="ui mini avatar image" src=""/>
                                            Jenny Hess
                                        </div>
                                        <div className="item" data-value="elliot" data-text="Elliot">
                                            <img className="ui mini avatar image"
                                                 src=""/>
                                            Elliot Fu
                                        </div>
                                        <div className="item" data-value="stevie" data-text="Stevie">
                                            <img className="ui mini avatar image"
                                                 src=""/>
                                            Stevie Feliciano
                                        </div>
                                        <div className="item" data-value="christian" data-text="Christian">
                                            <img className="ui mini avatar image"
                                                 src=""/>
                                            Christian
                                        </div>
                                        <div className="item" data-value="matt" data-text="Matt">
                                            <img className="ui mini avatar image" src=""/>
                                            Matt
                                        </div>
                                        <div className="item" data-value="justen" data-text="Justen">
                                            <img className="ui mini avatar image"
                                                 src=""/>
                                            Justen Kitsune
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div className="ui segment">
                                <div className="field">
                                    <div className="ui toggle checkbox">
                                        <input type="checkbox" name="gift" tabIndex="0" className="hidden"/>
                                        <label>Do not include a receipt in the package</label>
                                    </div>
                                </div>
                            </div>
                            <div className="ui button" tabIndex="0">Submit Order</div>
                        </form>
                    </div>
                </div>
            </div>
        )
    }
}