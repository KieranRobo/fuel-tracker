import React from 'react';
import { Route, Switch, Link } from 'react-router-dom';
import FuelView from '../FuelView';

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
                <td>ID</td>
                <td>Registration Number</td>
                <td>Brand</td>
                <td>Model</td>
                <td></td>
            </tr>
            {
                props.vehicles.map(ov => {
                    return (
                            <tr key={ov.id}>
                                <td>{ov.id}</td>
                                <td>{ov.registration}</td>
                                <td>{ov.vehicle.brand}</td>
                                <td>{ov.vehicle.model}</td>
                                <td><Link to={`/fuel/${ov.id}`}>Fuel View</Link></td>
                            </tr>
                    );
                })
            }
            
        </tbody>
        </table>
    );
};

export default VehicleList;