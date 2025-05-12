import { Link } from "react-router-dom";

export function Navbar(){
    return (
        <div>
            <Link to="/">Home</Link>
            <Link to="/about">About Us</Link>
            <Link to="/contact">Contact Us</Link>
        </div>
    )
}