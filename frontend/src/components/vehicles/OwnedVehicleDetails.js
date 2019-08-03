import React from 'react';

const OwnedVehicleDetails = props => {

    if (!props.ownedVehicle) {
        return (
            <div>Loading...</div>
        )
    }
    return (
        <div>Hello World</div>
    );
    
}

export default OwnedVehicleDetails;