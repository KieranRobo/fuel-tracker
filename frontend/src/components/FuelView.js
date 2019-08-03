import React from 'react';
import OwnedVehicleDetails from './vehicles/OwnedVehicleDetails';
import axios from "../api.service";


class FuelView extends React.Component {

    state = {
        ownedVehicle: null
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
                <h2>Fuel View</h2>
                <OwnedVehicleDetails ownedVehicle={this.state.ownedVehicle} />
            </div>

        );
    }
}

export default FuelView;