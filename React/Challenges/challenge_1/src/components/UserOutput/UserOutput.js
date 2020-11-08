import React from 'react';

const userOutput = props => {
  return (
    <div>
      <p>This is my first para. My name is {props.name}</p>
      <p>This is my second para</p>
    </div>
  );
};

export default userOutput;
