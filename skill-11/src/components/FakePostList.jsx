import { useEffect, useState } from "react";
import axios from "axios";

function FakePostList() {
  const [posts, setPosts] = useState([]);
  const [filteredPosts, setFilteredPosts] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");
  const [selectedUserId, setSelectedUserId] = useState("all");

  const fetchPosts = async () => {
    try {
      setLoading(true);
      const response = await axios.get("https://dummyjson.com/posts");
      setPosts(response.data.posts);
      setFilteredPosts(response.data.posts);
      setError("");
      setLoading(false);
    } catch (err) {
      setError("Failed to fetch posts");
      setLoading(false);
    }
  };

  useEffect(() => {
    fetchPosts();
  }, []);

  const handleFilterChange = (e) => {
    const value = e.target.value;
    setSelectedUserId(value);

    if (value === "all") {
      setFilteredPosts(posts);
    } else {
      const filtered = posts.filter((post) => post.userId === Number(value));
      setFilteredPosts(filtered);
    }
  };

  const uniqueUserIds = [...new Set(posts.map((post) => post.userId))];

  if (loading) {
    return <h2>Loading fake API posts...</h2>;
  }

  if (error) {
    return <h2>Error: {error}</h2>;
  }

  return (
    <div className="container">
      <h2>Fake API Posts</h2>

      <div className="top-bar">
        <button onClick={fetchPosts}>Refresh</button>

        <select value={selectedUserId} onChange={handleFilterChange}>
          <option value="all">All Users</option>
          {uniqueUserIds.map((id) => (
            <option key={id} value={id}>
              User {id}
            </option>
          ))}
        </select>
      </div>

      {filteredPosts.map((post) => (
        <div className="card" key={post.id}>
          <p><b>Title:</b> {post.title}</p>
          <p><b>Body:</b> {post.body}</p>
          <p><b>User ID:</b> {post.userId}</p>
        </div>
      ))}
    </div>
  );
}

export default FakePostList;