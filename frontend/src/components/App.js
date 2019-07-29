import React from 'react';
import FillUp from './FillUp'
import Home from './Home'
import { Route, Switch, Link } from 'react-router-dom';



function App() {
  return (
    <div className="App">
        
        <div><Link to="/">Home</Link></div>
        <div><Link to="/fillup">FillUp</Link></div>
        <Switch>
          <Route exact path="/" component={Home} />
          <Route path="/fillup" component={FillUp} />
        </Switch>
        
        
    </div>
  );
}

export default App;
