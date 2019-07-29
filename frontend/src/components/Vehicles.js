import React from 'react';

import axios from "../api.service";
import VehicleList from "./vehicles/VehicleList"



class Vehicles extends React.Component {

    state = {
        vehicles: []
    };

    componentDidMount() {
        axios.Vehicles.all()
        .then(response => {
            const newState = Object.assign({}, this.state, {
                vehicles: response.data
        });

        this.setState(newState);
        console.log("data: "+ this.state.vehicles[0].brand);
        });
        
    }   

        
        
        
    

    render() {
        return (
            <VehicleList vehicles={this.state.vehicles} />
        );
    }
}

export default Vehicles;