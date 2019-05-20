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
                                <i className="truck icon"></i>
                                <div className="content">
                                    <div className="title">Shipping</div>
                                    <div className="description">Choose your shipping options</div>
                                </div>
                            </div>
                            <div className="completed step">
                                <i className="credit card icon"></i>
                                <div className="content">
                                    <div className="title">Billing</div>
                                    <div className="description">Enter billing information</div>
                                </div>
                            </div>
                            <div className="active step">
                                <i className="info icon"></i>
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
                                        <option value="AK">Alaska</option>
                                        <option value="AZ">Arizona</option>
                                        <option value="AR">Arkansas</option>
                                        <option value="CA">California</option>
                                        <option value="CO">Colorado</option>
                                        <option value="CT">Connecticut</option>
                                        <option value="DE">Delaware</option>
                                        <option value="DC">District Of Columbia</option>
                                        <option value="FL">Florida</option>
                                        <option value="GA">Georgia</option>
                                        <option value="HI">Hawaii</option>
                                        <option value="ID">Idaho</option>
                                        <option value="IL">Illinois</option>
                                        <option value="IN">Indiana</option>
                                        <option value="IA">Iowa</option>
                                        <option value="KS">Kansas</option>
                                        <option value="KY">Kentucky</option>
                                        <option value="LA">Louisiana</option>
                                        <option value="ME">Maine</option>
                                        <option value="MD">Maryland</option>
                                        <option value="MA">Massachusetts</option>
                                        <option value="MI">Michigan</option>
                                        <option value="MN">Minnesota</option>
                                        <option value="MS">Mississippi</option>
                                        <option value="MO">Missouri</option>
                                        <option value="MT">Montana</option>
                                        <option value="NE">Nebraska</option>
                                        <option value="NV">Nevada</option>
                                        <option value="NH">New Hampshire</option>
                                        <option value="NJ">New Jersey</option>
                                        <option value="NM">New Mexico</option>
                                        <option value="NY">New York</option>
                                        <option value="NC">North Carolina</option>
                                        <option value="ND">North Dakota</option>
                                        <option value="OH">Ohio</option>
                                        <option value="OK">Oklahoma</option>
                                        <option value="OR">Oregon</option>
                                        <option value="PA">Pennsylvania</option>
                                        <option value="RI">Rhode Island</option>
                                        <option value="SC">South Carolina</option>
                                        <option value="SD">South Dakota</option>
                                        <option value="TN">Tennessee</option>
                                        <option value="TX">Texas</option>
                                        <option value="UT">Utah</option>
                                        <option value="VT">Vermont</option>
                                        <option value="VA">Virginia</option>
                                        <option value="WA">Washington</option>
                                        <option value="WV">West Virginia</option>
                                        <option value="WI">Wisconsin</option>
                                        <option value="WY">Wyoming</option>
                                    </select>
                                </div>
                                <div className="field">
                                    <label>Country</label>
                                    <div className="ui fluid search selection dropdown">
                                        <input type="hidden" name="country"/>
                                        <i className="dropdown icon"></i>
                                        <div className="default text">Select Country</div>
                                        <div className="menu">
                                            <div className="item" data-value="af"><i className="af flag"></i>Afghanistan
                                            </div>
                                            <div className="item" data-value="ax"><i className="ax flag"></i>Aland
                                                Islands
                                            </div>
                                            <div className="item" data-value="al"><i className="al flag"></i>Albania
                                            </div>
                                            <div className="item" data-value="dz"><i className="dz flag"></i>Algeria
                                            </div>
                                            <div className="item" data-value="as"><i className="as flag"></i>American
                                                Samoa
                                            </div>
                                            <div className="item" data-value="ad"><i className="ad flag"></i>Andorra
                                            </div>
                                            <div className="item" data-value="ao"><i className="ao flag"></i>Angola
                                            </div>
                                            <div className="item" data-value="ai"><i className="ai flag"></i>Anguilla
                                            </div>
                                            <div className="item" data-value="ag"><i className="ag flag"></i>Antigua
                                            </div>
                                            <div className="item" data-value="ar"><i className="ar flag"></i>Argentina
                                            </div>
                                            <div className="item" data-value="am"><i className="am flag"></i>Armenia
                                            </div>
                                            <div className="item" data-value="aw"><i className="aw flag"></i>Aruba</div>
                                            <div className="item" data-value="au"><i className="au flag"></i>Australia
                                            </div>
                                            <div className="item" data-value="at"><i className="at flag"></i>Austria
                                            </div>
                                            <div className="item" data-value="az"><i className="az flag"></i>Azerbaijan
                                            </div>
                                            <div className="item" data-value="bs"><i className="bs flag"></i>Bahamas
                                            </div>
                                            <div className="item" data-value="bh"><i className="bh flag"></i>Bahrain
                                            </div>
                                            <div className="item" data-value="bd"><i className="bd flag"></i>Bangladesh
                                            </div>
                                            <div className="item" data-value="bb"><i className="bb flag"></i>Barbados
                                            </div>
                                            <div className="item" data-value="by"><i className="by flag"></i>Belarus
                                            </div>
                                            <div className="item" data-value="be"><i className="be flag"></i>Belgium
                                            </div>
                                            <div className="item" data-value="bz"><i className="bz flag"></i>Belize
                                            </div>
                                            <div className="item" data-value="bj"><i className="bj flag"></i>Benin</div>
                                            <div className="item" data-value="bm"><i className="bm flag"></i>Bermuda
                                            </div>
                                            <div className="item" data-value="bt"><i className="bt flag"></i>Bhutan
                                            </div>
                                            <div className="item" data-value="bo"><i className="bo flag"></i>Bolivia
                                            </div>
                                            <div className="item" data-value="ba"><i className="ba flag"></i>Bosnia
                                            </div>
                                            <div className="item" data-value="bw"><i className="bw flag"></i>Botswana
                                            </div>
                                            <div className="item" data-value="bv"><i className="bv flag"></i>Bouvet
                                                Island
                                            </div>
                                            <div className="item" data-value="br"><i className="br flag"></i>Brazil
                                            </div>
                                            <div className="item" data-value="vg"><i className="vg flag"></i>British
                                                Virgin
                                                Islands
                                            </div>
                                            <div className="item" data-value="bn"><i className="bn flag"></i>Brunei
                                            </div>
                                            <div className="item" data-value="bg"><i className="bg flag"></i>Bulgaria
                                            </div>
                                            <div className="item" data-value="bf"><i className="bf flag"></i>Burkina
                                                Faso
                                            </div>
                                            <div className="item" data-value="mm"><i className="mm flag"></i>Burma</div>
                                            <div className="item" data-value="bi"><i className="bi flag"></i>Burundi
                                            </div>
                                            <div className="item" data-value="tc"><i className="tc flag"></i>Caicos
                                                Islands
                                            </div>
                                            <div className="item" data-value="kh"><i className="kh flag"></i>Cambodia
                                            </div>
                                            <div className="item" data-value="cm"><i className="cm flag"></i>Cameroon
                                            </div>
                                            <div className="item" data-value="ca"><i className="ca flag"></i>Canada
                                            </div>
                                            <div className="item" data-value="cv"><i className="cv flag"></i>Cape Verde
                                            </div>
                                            <div className="item" data-value="ky"><i className="ky flag"></i>Cayman
                                                Islands
                                            </div>
                                            <div className="item" data-value="cf"><i className="cf flag"></i>Central
                                                African
                                                Republic
                                            </div>
                                            <div className="item" data-value="td"><i className="td flag"></i>Chad</div>
                                            <div className="item" data-value="cl"><i className="cl flag"></i>Chile</div>
                                            <div className="item" data-value="cn"><i className="cn flag"></i>China</div>
                                            <div className="item" data-value="cx"><i className="cx flag"></i>Christmas
                                                Island
                                            </div>
                                            <div className="item" data-value="cc"><i className="cc flag"></i>Cocos
                                                Islands
                                            </div>
                                            <div className="item" data-value="co"><i className="co flag"></i>Colombia
                                            </div>
                                            <div className="item" data-value="km"><i className="km flag"></i>Comoros
                                            </div>
                                            <div className="item" data-value="cg"><i className="cg flag"></i>Congo
                                                Brazzaville
                                            </div>
                                            <div className="item" data-value="cd"><i className="cd flag"></i>Congo</div>
                                            <div className="item" data-value="ck"><i className="ck flag"></i>Cook
                                                Islands
                                            </div>
                                            <div className="item" data-value="cr"><i className="cr flag"></i>Costa Rica
                                            </div>
                                            <div className="item" data-value="ci"><i className="ci flag"></i>Cote
                                                Divoire
                                            </div>
                                            <div className="item" data-value="hr"><i className="hr flag"></i>Croatia
                                            </div>
                                            <div className="item" data-value="cu"><i className="cu flag"></i>Cuba</div>
                                            <div className="item" data-value="cy"><i className="cy flag"></i>Cyprus
                                            </div>
                                            <div className="item" data-value="cz"><i className="cz flag"></i>Czech
                                                Republic
                                            </div>
                                            <div className="item" data-value="dk"><i className="dk flag"></i>Denmark
                                            </div>
                                            <div className="item" data-value="dj"><i className="dj flag"></i>Djibouti
                                            </div>
                                            <div className="item" data-value="dm"><i className="dm flag"></i>Dominica
                                            </div>
                                            <div className="item" data-value="do"><i className="do flag"></i>Dominican
                                                Republic
                                            </div>
                                            <div className="item" data-value="ec"><i className="ec flag"></i>Ecuador
                                            </div>
                                            <div className="item" data-value="eg"><i className="eg flag"></i>Egypt</div>
                                            <div className="item" data-value="sv"><i className="sv flag"></i>El Salvador
                                            </div>
                                            <div className="item" data-value="gb"><i className="gb flag"></i>England
                                            </div>
                                            <div className="item" data-value="gq"><i className="gq flag"></i>Equatorial
                                                Guinea
                                            </div>
                                            <div className="item" data-value="er"><i className="er flag"></i>Eritrea
                                            </div>
                                            <div className="item" data-value="ee"><i className="ee flag"></i>Estonia
                                            </div>
                                            <div className="item" data-value="et"><i className="et flag"></i>Ethiopia
                                            </div>
                                            <div className="item" data-value="eu"><i className="eu flag"></i>European
                                                Union
                                            </div>
                                            <div className="item" data-value="fk"><i className="fk flag"></i>Falkland
                                                Islands
                                            </div>
                                            <div className="item" data-value="fo"><i className="fo flag"></i>Faroe
                                                Islands
                                            </div>
                                            <div className="item" data-value="fj"><i className="fj flag"></i>Fiji</div>
                                            <div className="item" data-value="fi"><i className="fi flag"></i>Finland
                                            </div>
                                            <div className="item" data-value="fr"><i className="fr flag"></i>France
                                            </div>
                                            <div className="item" data-value="gf"><i className="gf flag"></i>French
                                                Guiana
                                            </div>
                                            <div className="item" data-value="pf"><i className="pf flag"></i>French
                                                Polynesia
                                            </div>
                                            <div className="item" data-value="tf"><i className="tf flag"></i>French
                                                Territories
                                            </div>
                                            <div className="item" data-value="ga"><i className="ga flag"></i>Gabon</div>
                                            <div className="item" data-value="gm"><i className="gm flag"></i>Gambia
                                            </div>
                                            <div className="item" data-value="ge"><i className="ge flag"></i>Georgia
                                            </div>
                                            <div className="item" data-value="de"><i className="de flag"></i>Germany
                                            </div>
                                            <div className="item" data-value="gh"><i className="gh flag"></i>Ghana</div>
                                            <div className="item" data-value="gi"><i className="gi flag"></i>Gibraltar
                                            </div>
                                            <div className="item" data-value="gr"><i className="gr flag"></i>Greece
                                            </div>
                                            <div className="item" data-value="gl"><i className="gl flag"></i>Greenland
                                            </div>
                                            <div className="item" data-value="gd"><i className="gd flag"></i>Grenada
                                            </div>
                                            <div className="item" data-value="gp"><i className="gp flag"></i>Guadeloupe
                                            </div>
                                            <div className="item" data-value="gu"><i className="gu flag"></i>Guam</div>
                                            <div className="item" data-value="gt"><i className="gt flag"></i>Guatemala
                                            </div>
                                            <div className="item" data-value="gw"><i className="gw flag"></i>Guinea-Bissau
                                            </div>
                                            <div className="item" data-value="gn"><i className="gn flag"></i>Guinea
                                            </div>
                                            <div className="item" data-value="gy"><i className="gy flag"></i>Guyana
                                            </div>
                                            <div className="item" data-value="ht"><i className="ht flag"></i>Haiti</div>
                                            <div className="item" data-value="hm"><i className="hm flag"></i>Heard
                                                Island
                                            </div>
                                            <div className="item" data-value="hn"><i className="hn flag"></i>Honduras
                                            </div>
                                            <div className="item" data-value="hk"><i className="hk flag"></i>Hong Kong
                                            </div>
                                            <div className="item" data-value="hu"><i className="hu flag"></i>Hungary
                                            </div>
                                            <div className="item" data-value="is"><i className="is flag"></i>Iceland
                                            </div>
                                            <div className="item" data-value="in"><i className="in flag"></i>India</div>
                                            <div className="item" data-value="io"><i className="io flag"></i>Indian
                                                Ocean
                                                Territory
                                            </div>
                                            <div className="item" data-value="id"><i className="id flag"></i>Indonesia
                                            </div>
                                            <div className="item" data-value="ir"><i className="ir flag"></i>Iran</div>
                                            <div className="item" data-value="iq"><i className="iq flag"></i>Iraq</div>
                                            <div className="item" data-value="ie"><i className="ie flag"></i>Ireland
                                            </div>
                                            <div className="item" data-value="il"><i className="il flag"></i>Israel
                                            </div>
                                            <div className="item" data-value="it"><i className="it flag"></i>Italy</div>
                                            <div className="item" data-value="jm"><i className="jm flag"></i>Jamaica
                                            </div>
                                            <div className="item" data-value="jp"><i className="jp flag"></i>Japan</div>
                                            <div className="item" data-value="jo"><i className="jo flag"></i>Jordan
                                            </div>
                                            <div className="item" data-value="kz"><i className="kz flag"></i>Kazakhstan
                                            </div>
                                            <div className="item" data-value="ke"><i className="ke flag"></i>Kenya</div>
                                            <div className="item" data-value="ki"><i className="ki flag"></i>Kiribati
                                            </div>
                                            <div className="item" data-value="kw"><i className="kw flag"></i>Kuwait
                                            </div>
                                            <div className="item" data-value="kg"><i className="kg flag"></i>Kyrgyzstan
                                            </div>
                                            <div className="item" data-value="la"><i className="la flag"></i>Laos</div>
                                            <div className="item" data-value="lv"><i className="lv flag"></i>Latvia
                                            </div>
                                            <div className="item" data-value="lb"><i className="lb flag"></i>Lebanon
                                            </div>
                                            <div className="item" data-value="ls"><i className="ls flag"></i>Lesotho
                                            </div>
                                            <div className="item" data-value="lr"><i className="lr flag"></i>Liberia
                                            </div>
                                            <div className="item" data-value="ly"><i className="ly flag"></i>Libya</div>
                                            <div className="item" data-value="li"><i className="li flag"></i>Liechtenstein
                                            </div>
                                            <div className="item" data-value="lt"><i className="lt flag"></i>Lithuania
                                            </div>
                                            <div className="item" data-value="lu"><i className="lu flag"></i>Luxembourg
                                            </div>
                                            <div className="item" data-value="mo"><i className="mo flag"></i>Macau</div>
                                            <div className="item" data-value="mk"><i className="mk flag"></i>Macedonia
                                            </div>
                                            <div className="item" data-value="mg"><i className="mg flag"></i>Madagascar
                                            </div>
                                            <div className="item" data-value="mw"><i className="mw flag"></i>Malawi
                                            </div>
                                            <div className="item" data-value="my"><i className="my flag"></i>Malaysia
                                            </div>
                                            <div className="item" data-value="mv"><i className="mv flag"></i>Maldives
                                            </div>
                                            <div className="item" data-value="ml"><i className="ml flag"></i>Mali</div>
                                            <div className="item" data-value="mt"><i className="mt flag"></i>Malta</div>
                                            <div className="item" data-value="mh"><i className="mh flag"></i>Marshall
                                                Islands
                                            </div>
                                            <div className="item" data-value="mq"><i className="mq flag"></i>Martinique
                                            </div>
                                            <div className="item" data-value="mr"><i className="mr flag"></i>Mauritania
                                            </div>
                                            <div className="item" data-value="mu"><i className="mu flag"></i>Mauritius
                                            </div>
                                            <div className="item" data-value="yt"><i className="yt flag"></i>Mayotte
                                            </div>
                                            <div className="item" data-value="mx"><i className="mx flag"></i>Mexico
                                            </div>
                                            <div className="item" data-value="fm"><i className="fm flag"></i>Micronesia
                                            </div>
                                            <div className="item" data-value="md"><i className="md flag"></i>Moldova
                                            </div>
                                            <div className="item" data-value="mc"><i className="mc flag"></i>Monaco
                                            </div>
                                            <div className="item" data-value="mn"><i className="mn flag"></i>Mongolia
                                            </div>
                                            <div className="item" data-value="me"><i className="me flag"></i>Montenegro
                                            </div>
                                            <div className="item" data-value="ms"><i className="ms flag"></i>Montserrat
                                            </div>
                                            <div className="item" data-value="ma"><i className="ma flag"></i>Morocco
                                            </div>
                                            <div className="item" data-value="mz"><i className="mz flag"></i>Mozambique
                                            </div>
                                            <div className="item" data-value="na"><i className="na flag"></i>Namibia
                                            </div>
                                            <div className="item" data-value="nr"><i className="nr flag"></i>Nauru</div>
                                            <div className="item" data-value="np"><i className="np flag"></i>Nepal</div>
                                            <div className="item" data-value="an"><i className="an flag"></i>Netherlands
                                                Antilles
                                            </div>
                                            <div className="item" data-value="nl"><i className="nl flag"></i>Netherlands
                                            </div>
                                            <div className="item" data-value="nc"><i className="nc flag"></i>New
                                                Caledonia
                                            </div>
                                            <div className="item" data-value="pg"><i className="pg flag"></i>New Guinea
                                            </div>
                                            <div className="item" data-value="nz"><i className="nz flag"></i>New Zealand
                                            </div>
                                            <div className="item" data-value="ni"><i className="ni flag"></i>Nicaragua
                                            </div>
                                            <div className="item" data-value="ne"><i className="ne flag"></i>Niger</div>
                                            <div className="item" data-value="ng"><i className="ng flag"></i>Nigeria
                                            </div>
                                            <div className="item" data-value="nu"><i className="nu flag"></i>Niue</div>
                                            <div className="item" data-value="nf"><i className="nf flag"></i>Norfolk
                                                Island
                                            </div>
                                            <div className="item" data-value="kp"><i className="kp flag"></i>North Korea
                                            </div>
                                            <div className="item" data-value="mp"><i className="mp flag"></i>Northern
                                                Mariana
                                                Islands
                                            </div>
                                            <div className="item" data-value="no"><i className="no flag"></i>Norway
                                            </div>
                                            <div className="item" data-value="om"><i className="om flag"></i>Oman</div>
                                            <div className="item" data-value="pk"><i className="pk flag"></i>Pakistan
                                            </div>
                                            <div className="item" data-value="pw"><i className="pw flag"></i>Palau</div>
                                            <div className="item" data-value="ps"><i className="ps flag"></i>Palestine
                                            </div>
                                            <div className="item" data-value="pa"><i className="pa flag"></i>Panama
                                            </div>
                                            <div className="item" data-value="py"><i className="py flag"></i>Paraguay
                                            </div>
                                            <div className="item" data-value="pe"><i className="pe flag"></i>Peru</div>
                                            <div className="item" data-value="ph"><i className="ph flag"></i>Philippines
                                            </div>
                                            <div className="item" data-value="pn"><i className="pn flag"></i>Pitcairn
                                                Islands
                                            </div>
                                            <div className="item" data-value="pl"><i className="pl flag"></i>Poland
                                            </div>
                                            <div className="item" data-value="pt"><i className="pt flag"></i>Portugal
                                            </div>
                                            <div className="item" data-value="pr"><i className="pr flag"></i>Puerto Rico
                                            </div>
                                            <div className="item" data-value="qa"><i className="qa flag"></i>Qatar</div>
                                            <div className="item" data-value="re"><i className="re flag"></i>Reunion
                                            </div>
                                            <div className="item" data-value="ro"><i className="ro flag"></i>Romania
                                            </div>
                                            <div className="item" data-value="ru"><i className="ru flag"></i>Russia
                                            </div>
                                            <div className="item" data-value="rw"><i className="rw flag"></i>Rwanda
                                            </div>
                                            <div className="item" data-value="sh"><i className="sh flag"></i>Saint
                                                Helena
                                            </div>
                                            <div className="item" data-value="kn"><i className="kn flag"></i>Saint Kitts
                                                and
                                                Nevis
                                            </div>
                                            <div className="item" data-value="lc"><i className="lc flag"></i>Saint Lucia
                                            </div>
                                            <div className="item" data-value="pm"><i className="pm flag"></i>Saint
                                                Pierre
                                            </div>
                                            <div className="item" data-value="vc"><i className="vc flag"></i>Saint
                                                Vincent
                                            </div>
                                            <div className="item" data-value="ws"><i className="ws flag"></i>Samoa</div>
                                            <div className="item" data-value="sm"><i className="sm flag"></i>San Marino
                                            </div>
                                            <div className="item" data-value="gs"><i className="gs flag"></i>Sandwich
                                                Islands
                                            </div>
                                            <div className="item" data-value="st"><i className="st flag"></i>Sao Tome
                                            </div>
                                            <div className="item" data-value="sa"><i className="sa flag"></i>Saudi
                                                Arabia
                                            </div>
                                            <div className="item" data-value="sn"><i className="sn flag"></i>Senegal
                                            </div>
                                            <div className="item" data-value="cs"><i className="cs flag"></i>Serbia
                                            </div>
                                            <div className="item" data-value="rs"><i className="rs flag"></i>Serbia
                                            </div>
                                            <div className="item" data-value="sc"><i className="sc flag"></i>Seychelles
                                            </div>
                                            <div className="item" data-value="sl"><i className="sl flag"></i>Sierra
                                                Leone
                                            </div>
                                            <div className="item" data-value="sg"><i className="sg flag"></i>Singapore
                                            </div>
                                            <div className="item" data-value="sk"><i className="sk flag"></i>Slovakia
                                            </div>
                                            <div className="item" data-value="si"><i className="si flag"></i>Slovenia
                                            </div>
                                            <div className="item" data-value="sb"><i className="sb flag"></i>Solomon
                                                Islands
                                            </div>
                                            <div className="item" data-value="so"><i className="so flag"></i>Somalia
                                            </div>
                                            <div className="item" data-value="za"><i className="za flag"></i>South
                                                Africa
                                            </div>
                                            <div className="item" data-value="kr"><i className="kr flag"></i>South Korea
                                            </div>
                                            <div className="item" data-value="es"><i className="es flag"></i>Spain</div>
                                            <div className="item" data-value="lk"><i className="lk flag"></i>Sri Lanka
                                            </div>
                                            <div className="item" data-value="sd"><i className="sd flag"></i>Sudan</div>
                                            <div className="item" data-value="sr"><i className="sr flag"></i>Suriname
                                            </div>
                                            <div className="item" data-value="sj"><i className="sj flag"></i>Svalbard
                                            </div>
                                            <div className="item" data-value="sz"><i className="sz flag"></i>Swaziland
                                            </div>
                                            <div className="item" data-value="se"><i className="se flag"></i>Sweden
                                            </div>
                                            <div className="item" data-value="ch"><i className="ch flag"></i>Switzerland
                                            </div>
                                            <div className="item" data-value="sy"><i className="sy flag"></i>Syria</div>
                                            <div className="item" data-value="tw"><i className="tw flag"></i>Taiwan
                                            </div>
                                            <div className="item" data-value="tj"><i className="tj flag"></i>Tajikistan
                                            </div>
                                            <div className="item" data-value="tz"><i className="tz flag"></i>Tanzania
                                            </div>
                                            <div className="item" data-value="th"><i className="th flag"></i>Thailand
                                            </div>
                                            <div className="item" data-value="tl"><i className="tl flag"></i>Timorleste
                                            </div>
                                            <div className="item" data-value="tg"><i className="tg flag"></i>Togo</div>
                                            <div className="item" data-value="tk"><i className="tk flag"></i>Tokelau
                                            </div>
                                            <div className="item" data-value="to"><i className="to flag"></i>Tonga</div>
                                            <div className="item" data-value="tt"><i className="tt flag"></i>Trinidad
                                            </div>
                                            <div className="item" data-value="tn"><i className="tn flag"></i>Tunisia
                                            </div>
                                            <div className="item" data-value="tr"><i className="tr flag"></i>Turkey
                                            </div>
                                            <div className="item" data-value="tm"><i className="tm flag"></i>Turkmenistan
                                            </div>
                                            <div className="item" data-value="tv"><i className="tv flag"></i>Tuvalu
                                            </div>
                                            <div className="item" data-value="ug"><i className="ug flag"></i>Uganda
                                            </div>
                                            <div className="item" data-value="ua"><i className="ua flag"></i>Ukraine
                                            </div>
                                            <div className="item" data-value="ae"><i className="ae flag"></i>United Arab
                                                Emirates
                                            </div>
                                            <div className="item" data-value="us"><i className="us flag"></i>United
                                                States
                                            </div>
                                            <div className="item" data-value="uy"><i className="uy flag"></i>Uruguay
                                            </div>
                                            <div className="item" data-value="um"><i className="um flag"></i>Us Minor
                                                Islands
                                            </div>
                                            <div className="item" data-value="vi"><i className="vi flag"></i>Us Virgin
                                                Islands
                                            </div>
                                            <div className="item" data-value="uz"><i className="uz flag"></i>Uzbekistan
                                            </div>
                                            <div className="item" data-value="vu"><i className="vu flag"></i>Vanuatu
                                            </div>
                                            <div className="item" data-value="va"><i className="va flag"></i>Vatican
                                                City
                                            </div>
                                            <div className="item" data-value="ve"><i className="ve flag"></i>Venezuela
                                            </div>
                                            <div className="item" data-value="vn"><i className="vn flag"></i>Vietnam
                                            </div>
                                            <div className="item" data-value="wf"><i className="wf flag"></i>Wallis and
                                                Futuna
                                            </div>
                                            <div className="item" data-value="eh"><i className="eh flag"></i>Western
                                                Sahara
                                            </div>
                                            <div className="item" data-value="ye"><i className="ye flag"></i>Yemen</div>
                                            <div className="item" data-value="zm"><i className="zm flag"></i>Zambia
                                            </div>
                                            <div className="item" data-value="zw"><i className="zw flag"></i>Zimbabwe
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
                                    <i className="dropdown icon"></i>
                                    <div className="default text">Saved Contacts</div>
                                    <div className="menu">
                                        <div className="item" data-value="jenny" data-text="Jenny">
                                            <img className="ui mini avatar image" src="/images/avatar/small/jenny.jpg"/>
                                            Jenny Hess
                                        </div>
                                        <div className="item" data-value="elliot" data-text="Elliot">
                                            <img className="ui mini avatar image"
                                                 src="/images/avatar/small/elliot.jpg"/>
                                            Elliot Fu
                                        </div>
                                        <div className="item" data-value="stevie" data-text="Stevie">
                                            <img className="ui mini avatar image"
                                                 src="/images/avatar/small/stevie.jpg"/>
                                            Stevie Feliciano
                                        </div>
                                        <div className="item" data-value="christian" data-text="Christian">
                                            <img className="ui mini avatar image"
                                                 src="/images/avatar/small/christian.jpg"/>
                                            Christian
                                        </div>
                                        <div className="item" data-value="matt" data-text="Matt">
                                            <img className="ui mini avatar image" src="/images/avatar/small/matt.jpg"/>
                                            Matt
                                        </div>
                                        <div className="item" data-value="justen" data-text="Justen">
                                            <img className="ui mini avatar image"
                                                 src="/images/avatar/small/justen.jpg"/>
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