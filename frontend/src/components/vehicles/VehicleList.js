import React from 'react';

const VehicleList = props => {
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
                        <tr>
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