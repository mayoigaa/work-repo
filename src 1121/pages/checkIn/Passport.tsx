import React, { useEffect } from "react";
import initScripts from "../../assets/js/scripts";
import initCustom from "../../assets/js/custom";
import { Accordion } from "react-bootstrap";

function Passport() {
  useEffect(() => {
    initScripts();
    initCustom();
  }, []);
  return (
    <>
      <div className="hero hero-inner">
        <div className="container">
          <div className="row align-items-center"></div>
        </div>
      </div>
              
      <Accordion className="test1">
        <Accordion.Item eventKey="0">
          <Accordion.Header>여권정보 #1</Accordion.Header>
          <Accordion.Body>
            {/* 여권 정보 입력    */}
            <div className="row mb-2">           
              <div className="col-10">


                    {/*  여권정보2  */}
               
                <div className="input-group">
                  <div className="col-sm-10 col-md-6 mb-3 mb-lg-0 col-lg-3">
                    <div className="is-invalid">
                    <select
                      name=""
                      id=""
                      className="form-control custom-select"
                    >
                      <option value="">국적</option>
                      <option value="">페루</option>
                      <option value="">일본</option>
                      <option value="">태국</option>
                      <option value="">브라질</option>
                      <option value="">미국</option>
                      <option value="">일본</option>
                      <option value="">한국</option>
                    </select>
                    </div>
                    <div className="invalid-feedback">* 필수입력</div>

                  </div>
                  

                 
                  <div className="col-sm-10 col-md-3 mb-3 mb-lg-2 col-lg-3">
                  <div className="is-invalid">
                    <select
                      name=""
                      id=""
                      className="form-control custom-select"
                    >
                      <option value="">성별</option>
                      <option value="">여성</option>
                      <option value="">남성</option>
                    </select>
                    </div>
                    <div className="invalid-feedback">* 필수입력</div>

                  </div>
             



                 
                  <div className="col-sm-10 col-md-6 mb-3 mb-lg-2 col-lg-4">
                  <div className="is-invalid">
                    <input
                      type="text"
                      className="form-control"
                      placeholder="생년월일"
                    />
                  </div>
                  <div className="invalid-feedback">* 필수입력</div>

                  </div>
                

                 
                  <div className="col-sm-10 col-md-6 mb-3 mb-lg-0 col-lg-3">
                    <div className="is-invalid">
                    <select
                      name=""
                      id=""
                      className="form-control custom-select"
                    >
                      <option value="">여권발급국가</option>
                      <option value="">페루</option>
                      <option value="">일본</option>
                      <option value="">태국</option>
                      <option value="">브라질</option>
                      <option value="">미국</option>
                      <option value="">일본</option>
                      <option value="">한국</option>
                    </select>
                    </div>
                    <div className="invalid-feedback">* 필수입력</div>

                  </div>
               



            
                  <div className="col-sm-10 col-md-6 mb-3 mb-lg-2 col-lg-4">
                    <div className="is-invalid">
                    <input
                      name=""
                      type="type"
                      className="form-control"
                      placeholder="여권번호"
                      />
                      </div>
                      <div className="invalid-feedback">* 필수입력</div>
                      </div>
                     
                      


                   
                  <div className="col-sm-10 col-md-6 mb-3 mb-lg-2 col-lg-3">
                    <div className="is-invalid">
                    <input
                      type="type"
                      className="form-control"
                      placeholder="여권 만료일 "
                    />
                    </div>
                    <div className="invalid-feedback">* 필수입력</div>
                    </div>
                  </div>
               
              

               


              
                </div>
            </div>
            {/* 여권정보입력  */}
          </Accordion.Body>
        </Accordion.Item>
        <Accordion.Item eventKey="1">
          <Accordion.Header>탑승자 정보 입력 (국내선) #2</Accordion.Header>
          <Accordion.Body>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
          </Accordion.Body>
        </Accordion.Item>
        <Accordion.Item eventKey="2">
          <Accordion.Header>좌석 지정 #3</Accordion.Header>
          <Accordion.Body>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
          </Accordion.Body>
        </Accordion.Item>
        <Accordion.Item eventKey="3">
          <Accordion.Header>수하물추가 #4</Accordion.Header>
          <Accordion.Body>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
          </Accordion.Body>
        </Accordion.Item>
        <Accordion.Item eventKey="4">
          <Accordion.Header>탑승권 전송 #5</Accordion.Header>
          <Accordion.Body>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
          </Accordion.Body>
        </Accordion.Item>
      </Accordion>
    </>
  );
}

export default Passport;
