import React, { Component } from 'react';
import './App.css';
import UserInput from './components/UserInput/UserInput';
import UserOutput from './components/UserOutput/UserOutput';

class App extends Component {
  state = {
    users: [
      { name: 'Avinash', age: 24 },
      { name: 'Abishek', age: 30 }
    ]
  };

  onChangeHandler = event => {
    this.setState({
      users: [
        { name: event.target.value, age: 24 },
        { name: 'Abishek', age: 30 }
      ]
    });
  };

  render() {
    return (
      <div className="App">
        <UserInput
          name={this.state.users[0].name}
          change={event => this.onChangeHandler(event)}
        ></UserInput>
        {this.state.users.map((user, index) => {
          return (
            <UserOutput
              key={index}
              name={user.name}
              age={user.age}
            ></UserOutput>
          );
        })}
      </div>
    );
  }
}

export default App;
