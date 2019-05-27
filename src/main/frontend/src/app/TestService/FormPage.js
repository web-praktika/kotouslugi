import React, {Component} from 'react';
import Step from "./Stepper";
import FirstStepForm from "./FirstStepForm";
import SecondStepForm from "./SecondStepForm";
import ThirdStepForm from "./ThirdStepForm";

export default class TestServicePage extends Component {

    state = {
        activeStep: 0,
        numberOfSteps: 3
    };

    changeStepNext = () => {
        let {activeStep, numberOfSteps} = this.state;
        if (activeStep + 1 < numberOfSteps) {
            activeStep++;
            this.setState({activeStep: activeStep})
        }
    };

    submitForm = (e) => {
        e.preventDefault();
        console.log(this.state);
        this.changeStepNext()
    };

    handleChange = (e) => {
        this.setState({[e.target.name]: e.target.value});
    };

    render() {

        return (
            <div className="">
                <Step activeStepNumber={this.state.activeStep}/>
                {this.state.activeStep === 0 ? <FirstStepForm submitForm={this.submitForm} handleChange={this.handleChange}/> : null}
                {this.state.activeStep === 1 ? <SecondStepForm submitForm={this.submitForm} handleChange={this.handleChange}/> : null}
                {this.state.activeStep === 2 ? <ThirdStepForm submitForm={this.submitForm} handleChange={this.handleChange}/> : null}

            </div>
        )
    }
}