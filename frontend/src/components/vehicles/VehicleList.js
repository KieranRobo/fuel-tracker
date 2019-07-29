import React from 'react';

const VehicleList = props => {
    if (!props.vehicles) {
        return (
            <div>Loading...</div>
        )
    }
    return (
        <table>
        <tbody>
            <tr>
                <td>Brand</td>
                <td>Model</td>
            </tr>
            {
                props.vehicles.map(vehicle => {
                    return (
                        <tr key={vehicle.id}>
                            <td>{vehicle.brand}</td>
                            <td>{vehicle.model}</td>    
                        </tr>
                    );
                })
            }
            
        </tbody>
        </table>
    );
};

export default VehicleList;