// AddCutomer.js

import React, {useState} from "react";
import "../assets/chapter15.css"

function AddCustomer() {

 
  const initialCustomer = {
    cid: "",      //회원정보
    cname: "",   // 이름
    email: "",   // 이메일
    phone:"",   // 전화번호
  }

  let [customer, setCustomer] = useState(initialCustomer); 


 
  const handleChange = (event) => { 
   
    let attrValue = event.target.value;
   
    let attrName = event.target.name; 
    
    setCustomer({ ...customer, [attrName]:attrValue}) 
   }

  const saveCustomer = () => { 
    alert("저장되었습니다.");
   }


  return (
   
    <div className="submit-form">
      <div>
        <div className="form-group mb-3">
          <label htmlFor="cname">Cname</label>
          <input
            type="text"
            className="form-control"
            id="cname"
            required
            value={customer.cname}
            onChange={handleChange}
            name="cname"
          />
        </div>

        <div className="form-group mb-3">
          <label htmlFor="text">Email</label>
          <input
            type="text"
            className="form-control"
            id="email"
            required
            value={customer.loc}
            onChange={handleChange}
            name="email"
          />
        </div>

        <div className="form-group mb-3">
          <label htmlFor="text">Phone</label>
          <input
            type="text"
            className="form-control"
            id="phone"
            required
            value={customer.loc}
            onChange={handleChange}
            name="phone"
          />
        </div>

        <button onClick={saveCustomer} className="btn btn-success">
          Submit
        </button>
      </div>
    </div>
  );
}

export default AddCustomer;
