import React from 'react';
import FillUp from './FillUp'
import Home from './Home'
import { Route, Switch, Link } from 'react-router-dom';
import Vehicles from './Vehicles';



function App() {
  return (
    <div className="App">
        
        <div><Link to="/">Home</Link></div>
        <div><Link to="/fillup">FillUp</Link></div>
        <div><Link to="/vehicles">Vehicles</Link></div>
        <Switch>
          <Route exact path="/" component={Home} />
          <Route path="/fillup" component={FillUp} />
          <Route path="/vehicles" component={Vehicles} />
        </Switch>
        
        
    </div>
  );
}

export default App;
