import React from "react";
import ReactDOM from "react-dom";
import "../resources/static/scss/main.scss";

class Admin extends React.Component {
    constructor(props) {
        super(props);
        this.state = {};
    }

    componentDidMount() {
    }

    render() {
        return (
            <div>
                React Admin Page
            </div>
        )
    }
}

ReactDOM.render(
    <Admin/>,
    document.getElementById('react')
);