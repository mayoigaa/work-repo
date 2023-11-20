
// Customer.js : 자식컴포넌트

import React, { useState } from "react";

function Customer() {

  const initialCustomer = [
    {
      cid:1,
      cname:"홍길동",
      email:" hong@naver.com",
      phone:"010-1234-5678",
    },
    {
      cid:2,
      cname:"장길산",
      email:" jang@naver.com",
      phone:"010-1234-5678",
    },
    {
      cid:3,
      cname:"임꺽정",
      email:"lim@naver.com",
      phone:"010-1234-5678",
    },

  ];

  let [customer, setCustomer] = useState(initialCustomer);
  return (
    <div className="container mt-3">
  
      <h4>Customer List</h4>
      {customer.map((value, index)=>(
      
      <ul class="list-group">
    s
        <li class="list-group-item">{value.cid}</li>
          <li class="list-group-item">{value.cname}</li>
          <li class="list-group-item">{value.email}</li>
          <li class="list-group-item">{value.phone}</li>
      </ul>
       )) }
    </div>
  );
}

export default Customer;