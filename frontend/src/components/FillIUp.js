import React from 'react';

import axios from "../api.service";
import {Form} from 'react-bootstrap';
import {Button} from 'react-bootstrap'

class FillUp extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            ownedVehicle: { vehicle : null },
            currentMileage: '',
            litres: '',
            cost: '',
            submitted: false
        };


        this.handleSubmit = this.handleSubmit.bind(this);

        this.mileageChange = this.mileageChange.bind(this);
        this.litresChange = this.litresChange.bind(this);
        this.costChange = this.costChange.bind(this);
        
    }

    mileageChange(event) { this.setState({ currentMileage: event.target.value }) }
    litresChange(event) { this.setState({ litres: event.target.value }) }
    costChange(event) { this.setState({ cost: event.target.value }) }

    handleSubmit(event) {
        event.preventDefault();
        this.setState({ submitted: true })
    }

    componentDidMount() {
        let vehicleId = this.props.match.params.vehicle;

        axios.OwnedVehicles.details(vehicleId)
        .then(response => {
            const newState = Object.assign({}, this.state, {
                ownedVehicle: response.data
        });

        this.setState(newState);
        });
        
    }
    

    render() {
        if (this.state.ownedVehicle.vehicle == null) {
            return (
                <div>Loading...</div>
            )
        }
        if (this.state.submitted) {
            return (
                <div>submitted</div>
            )
        }
        return (
            <div>
                <h2>Fill Up</h2>
                <div>Lets track a new fill up for your {this.state.ownedVehicle.vehicle.brand} {this.state.ownedVehicle.vehicle.model}</div>
                <hr></hr>
                <Form onSubmit={this.handleSubmit}>
                    <Form.Label>What is your <strong>current mileage</strong>?</Form.Label>
                    <Form.Control size="lg" type="text" value={this.state.currentMileage} onChange={this.mileageChange} /><br />

                    <Form.Label>How much <strong>litres</strong> did you fill up?</Form.Label>
                    <Form.Control size="lg" type="text" value={this.state.litres} onChange={this.litresChange} /><br />

                    <Form.Label>How much did this fill up <strong>cost</strong>?</Form.Label>
                    <Form.Control size="lg" type="text" value={this.state.cost} onChange={this.costChange} /><br />

                    <Button type="submit" size="lg">Track It!</Button>
                </Form>
            </div>

        );
    }
}

export default FillUp;