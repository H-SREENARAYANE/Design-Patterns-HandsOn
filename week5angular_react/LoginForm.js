import { useState } from "react";

function LoginForm() {

  const [name,setName] = useState("");

  return (
    <div>
      <input
        type="text"
        onChange={(e)=>setName(e.target.value)}
      />

      <h3>{name}</h3>
    </div>
  );
}

export default LoginForm;