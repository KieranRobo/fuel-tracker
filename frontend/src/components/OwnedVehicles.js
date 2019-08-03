import React from 'react';

import axios from "../api.service";
import OwnedVehicleList from "./vehicles/OwnedVehicleList"



class Vehicles extends React.Component {

    state = {
        vehicles: null
    };

    componentDidMount() {
        axios.OwnedVehicles.all()
        .then(response => {
            const newState = Object.assign({}, this.state, {
                vehicles: response.data
        });

        this.setState(newState);
        });
        
    }   

        
        
        
    

    render() {
        
        return (
            <OwnedVehicleList vehicles={this.state.vehicles} />
        );
    }
}

export default Vehicles;