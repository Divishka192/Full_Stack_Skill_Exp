import React, { useEffect, useState } from "react";
import axios from "axios";

const FakePostList = () => {
  const [posts, setPosts] = useState([]);
  const [filter, setFilter] = useState("");
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  const fetchPosts = () => {
    setLoading(true);
    axios
      .get("https://dummyjson.com/posts")
      .then((res) => {
        setPosts(res.data.posts);
        setLoading(false);
      })
      .catch((err) => {
        setError(err.message);
        setLoading(false);
      });
  };

  useEffect(() => {
    fetchPosts();
  }, []);

  const filteredPosts = filter
    ? posts.filter((p) => p.userId === parseInt(filter))
    : posts;

  if (loading) return <p>Loading posts...</p>;
  if (error) return <p>Error: {error}</p>;

  return (
    <div>
      <h2>Fake API Posts</h2>
      <button onClick={fetchPosts}>Refresh</button>
      <br /><br />
      <label>Filter by User:</label>
      <select onChange={(e) => setFilter(e.target.value)} value={filter}>
        <option value="">All</option>
        <option value="1">User 1</option>
        <option value="2">User 2</option>
        <option value="3">User 3</option>
      </select>

      {filteredPosts.map((post) => (
        <div key={post.id}>
          <h4>{post.title}</h4>
          <p>{post.body}</p>
        </div>
      ))}
    </div>
  );
};

export default FakePostList;