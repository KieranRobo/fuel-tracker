import React from 'react';
import Home from './Home'
import { Route, Switch, Link } from 'react-router-dom';
import OwnedVehicles from './OwnedVehicles';
import FuelView from './FuelView';
import FillUp from './FillIUp';



function App() {
  return (
    <div className="App">
        
        <div><Link to="/">Home</Link></div>
        <div><Link to="/vehicles">Owned Vehicles</Link></div>
        <Switch>
          <Route exact path="/" component={Home} />
          <Route exact path="/vehicles" component={OwnedVehicles} />
          <Route exact path="/fuel/:vehicle" component={FuelView} />
          <Route exact path="/fuel/:vehicle/fill-up" component={FillUp} />
        </Switch>
        
        
    </div>
  );
}

export default App;
