import React, { Component } from 'react';
import './App.css';
import ValidateComponent from './Components/ValidateComponent/ValidateComponent';
import CharComponent from './Components/CharComponent/CharComponent';

class App extends Component {
  state = {
    inputEntered: 'Hello'
  };
  onChangeHandler = event => {
    this.setState({ inputEntered: event.target.value });
  };

  onDeleteHandler = index => {
    let newstatevalue = this.state.inputEntered.split('');
    newstatevalue.splice(index, 1);
    let latestText = newstatevalue.join('');
    this.setState({ inputEntered: latestText });
  };

  render() {
    return (
      <div className="App">
        <input
          type="text"
          value={this.state.inputEntered}
          onChange={event => this.onChangeHandler(event)}
        ></input>
        <p>
          The length of the entered input is: {this.state.inputEntered.length}
        </p>
        <ValidateComponent
          enteredTextLength={this.state.inputEntered.length}
        ></ValidateComponent>
        {this.state.inputEntered.split('').map((singlechar, index) => {
          return (
            <CharComponent
              key={index}
              singleCharacter={singlechar}
              delete={index => this.onDeleteHandler(index)}
            ></CharComponent>
          );
        })}
      </div>
    );
  }
}

export default App;
