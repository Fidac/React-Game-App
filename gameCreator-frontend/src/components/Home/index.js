import React from "react";

import LayoutWrapper from "../LayoutWrapper";
import logo from '../../game-logo.png';

export function Home() {
    return (
        <div className="body-content">
            <div>REACT presentation with CRUD use case</div>
            <img src={logo} className="game-logo" alt="logo" />
            <p>
                Where all the games begin
            </p>
            {/*<a*/}
            {/*    className="App-link"*/}
            {/*    href="https://reactjs.org"*/}
            {/*    target="_blank"*/}
            {/*    rel="noopener noreferrer"*/}
            {/*>*/}
            {/*    Learn React*/}
            {/*</a>*/}
        </div>
    )
}

const WrappedHome = LayoutWrapper(Home);
export default WrappedHome;