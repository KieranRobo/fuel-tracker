import React from 'react';

import axios from "../api.service";



class FillUp extends React.Component {

    state = {
        ownedVehicle: { vehicle : null }
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
        if (this.state.ownedVehicle.vehicle == null) {
            return (
                <div>Loading...</div>
            )
        }
        return (
            <div>You are filling up your {this.state.ownedVehicle.vehicle.brand} {this.state.ownedVehicle.vehicle.model}</div>
        );
    }
}

export default FillUp;