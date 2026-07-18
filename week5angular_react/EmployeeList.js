function EmployeeList() {

  const employees = [
    "Ram",
    "Sita",
    "Kumar"
  ];

  return (
    <ul>
      {employees.map((e,index)=>
      <li key={index}>{e}</li>)}
    </ul>
  );
}

export default EmployeeList;