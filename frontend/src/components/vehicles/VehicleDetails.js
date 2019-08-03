import React from 'react';

const VehicleDetails = props => {

    if (!props.vehicle) {
        return (
            <div>Loading...</div>
        )
    }
    return (
        <div>
            <div>{props.vehicle.brand}</div>
            <div>{props.vehicle.model}</div>
        </div>
    );
    
}

export default VehicleDetails;