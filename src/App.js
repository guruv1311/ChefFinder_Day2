import logo from './logo.svg';
import './App.css';

import { BrowserRouter as Router,Routes,Route } from 'react-router-dom';
import Login from './page/User/Login';
import Sign from './page/User/Sign';
import Nav from './page/User/Nav';
import Navi from './page/User/Navi';
// import Main from './page/User/Main';
function App() {
  return (
    <Router>
    <div>
      <Routes>
        <Route path="/Login" element={<Login/>}/>
        <Route path="/Sign" element={<Sign/>}/>
      <Route path="/" element={<Navi/>}/>
      {/* <Route path="/" element={<Nav/>}/>*/}
      </Routes>
    </div>
    </Router>
  );
}

export default App;
