import { useState } from "react";

function StudentManager() {

  const [students, setStudents] = useState([
    { id: 1, name: "Rahul", course: "CSE" },
    { id: 2, name: "Priya", course: "AI" },
    { id: 3, name: "Kiran", course: "IT" }
  ]);

  const [id, setId] = useState("");
  const [name, setName] = useState("");
  const [course, setCourse] = useState("");

  const addStudent = () => {
    const newStudent = { id, name, course };
    setStudents([...students, newStudent]);

    setId("");
    setName("");
    setCourse("");
  };

  const deleteStudent = (id) => {
    const updated = students.filter((s) => s.id !== id);
    setStudents(updated);
  };

  return (
    <div>

      <h2>Student Manager</h2>

      <input
        placeholder="ID"
        value={id}
        onChange={(e) => setId(e.target.value)}
      />

      <input
        placeholder="Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />

      <input
        placeholder="Course"
        value={course}
        onChange={(e) => setCourse(e.target.value)}
      />

      <button onClick={addStudent}>Add Student</button>

      <h3>Student List</h3>

      {students.length === 0 ? (
        <p>No students available</p>
      ) : (
        students.map((s) => (
          <div key={s.id}>
            {s.id} - {s.name} - {s.course}
            <button onClick={() => deleteStudent(s.id)}>Delete</button>
          </div>
        ))
      )}

    </div>
  );
}

export default StudentManager;