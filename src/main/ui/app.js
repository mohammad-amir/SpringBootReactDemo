import React from "react";
import ReactDOM from "react-dom";
import "../resources/static/scss/main.scss";

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {};
    }

    componentDidMount() {
    }

    render() {
        return (
            <div>
                React Home Page
                <i className="fas fa-eraser"></i>
                <i className="fab fa-apple"></i>
            </div>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
);