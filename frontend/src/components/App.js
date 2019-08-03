import React from 'react';
import FillUp from './FillUp'
import Home from './Home'
import { Route, Switch, Link } from 'react-router-dom';
import OwnedVehicles from './OwnedVehicles';
import FuelView from './FuelView';



function App() {
  return (
    <div className="App">
        
        <div><Link to="/">Home</Link></div>
        <div><Link to="/fillup">FillUp</Link></div>
        <div><Link to="/vehicles">Vehicles</Link></div>
        <Switch>
          <Route exact path="/" component={Home} />
          <Route path="/fillup" component={FillUp} />
          <Route path="/vehicles" component={OwnedVehicles} />
          <Route exact path="/fuel/:vehicle" component={FuelView} />
        </Switch>
        
        
    </div>
  );
}

export default App;
