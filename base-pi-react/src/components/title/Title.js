import React, { useState } from 'react';
import './Title.css';

function Title(props) {
    return (
        <>
            <h2 className='title'><img width='50' className='imgUser' src={props.titleIcon}/> {props.titleText}</h2>
            <hr className='line-1'/>
        </>
    );
}

export default Title;