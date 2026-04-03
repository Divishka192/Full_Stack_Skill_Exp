import { Link } from "react-router-dom";

function Dashboard() {
  return (
    <div className="container">
      <h1>React API Integration Dashboard</h1>
      <div className="nav-links">
        <Link to="/local-users">Local Users</Link>
        <Link to="/users-api">Users API</Link>
        <Link to="/fake-posts">Fake API Posts</Link>
      </div>
    </div>
  );
}

export default Dashboard;