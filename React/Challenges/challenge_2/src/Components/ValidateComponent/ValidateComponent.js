import React from 'react';

const validateComponent = props => {
  let lengthMessage = 'Text too short';
  if (props.enteredTextLength > 5) {
    lengthMessage = 'Text long enough';
  }
  return <p>{lengthMessage}</p>;
};

export default validateComponent;
