import React from 'react';
import Home from './Home'
import { Route, Switch, Link } from 'react-router-dom';
import OwnedVehicles from './OwnedVehicles';
import FuelView from './FuelView';
import FillUp from './FillIUp';
import Button from 'react-bootstrap/Button';
import ButtonGroup from 'react-bootstrap/Button';



function App() {
  return (
    <div className="App">

        <ButtonGroup>
          <Link to="/"><Button variant="secondary">Home</Button></Link>
          <Link to="/vehicles"><Button variant="secondary">Owned Vehicles</Button></Link>
          <Button variant="secondary">Logout</Button>
        </ButtonGroup>
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
