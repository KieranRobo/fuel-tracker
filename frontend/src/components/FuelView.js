import React from 'react';
import VehicleDetails from './vehicles/VehicleDetails';
import { Link } from 'react-router-dom';
import axios from "../api.service";


class FuelView extends React.Component {

    state = {
        ownedVehicle: {vehicle: null}
    };

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
        return (
            <div>
                <h1>Fuel View</h1>
                <Link to={`/fuel/${this.state.ownedVehicle.id}/fill-up`}>Fill Up</Link>
                <h3>This Vehicle</h3>
                <VehicleDetails vehicle={this.state.ownedVehicle.vehicle} />
                <h3>Fuel Economy</h3>
                <div>Coming Soon...</div>
            </div>

        );
    }
}

export default FuelView;