import React from 'react';
import './CharComponent.css';

const charComponent = props => {
  return (
    <div className="inlineBox" onClick={props.delete}>
      {props.singleCharacter}
    </div>
  );
};

export default charComponent;
