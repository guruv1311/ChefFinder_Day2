
import React, { Component } from 'react'
import '../../css-components/Nav.css';
class Nav extends Component {
  state={clicked:false};
  handleClick =() =>{
    this.setState({clicked:!this.state.clicked})
  }
  render(){
  return (
    <>
  <div className="backm">
    <nav>
      <div>
            <ul id="navbar" className={this.state.clicked ? 
            "#navbar active" : "#navbar"}>
                <li><a  className="active"href="#">Home</a></li>
                <li><a href="#">Home</a></li>
                <li><a href="#">Home</a></li>
                <li><a href="#">Home</a></li>
                <li><a href="#">Home</a></li>
            </ul>
        </div>
        <div id="mobile" onClick={this.handleClick}>
          <i id="bar"
          className={this.state.clicked ? 
            'fas fa-times':'fas fa-bars'}>
        </i>
        </div>
    </nav>
  </div>
    </>
  );
}
}

export default Nav;