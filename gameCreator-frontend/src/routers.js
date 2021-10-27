import React from 'react';
import {BrowserRouter, Switch, Route} from "react-router-dom";
import GamePage from "./components/GamePage";
import Home from "./components/Home";

export default function RouterConfig() {
    return (
        <BrowserRouter>
            <Switch>
                <Route exact path="/" key={1} component={Home}/>
                <Route exact path="/creation" key={2} component={GamePage} />
            </Switch>
        </BrowserRouter>
    );
}