import React from "react";
import { Link } from "react-router-dom";

function Boardingpass() {
  return (
    <>
      <div className="hero hero-inner">
        <div className="container">
          <div className="row align-items-center">
            <div className="col-lg-6 mx-auto text-center">
              <div className="intro-wrap">
                <h1 className="mb-0"></h1>
              </div>
            </div>
          </div>
        </div>
      </div>
     
    
      <div className="untree_co-section">
      <div className="container">
        <h4>GreenAir</h4>
        <div className="line_row_wrap">
          <dl className="line_row">
            <dt>
              <span className="tit">
               안녕하세요,  고객님의 체크인이 확정되었습니다!
              </span>
            </dt>
            <div>
              <h6>
                예약 정보
              </h6>
              <p>예약자명</p>
              <p>성별/생년월일</p> 
              <table>
                <thead>
                  <tr className="col_black">항공편</tr>
                  
                  <tr className="col_black">좌석</tr>
                  <tr className="col_black">수화물</tr>
                  <p>[휴대수화물]</p>
                  <p>[위탁수화물]</p>
                </thead>
              </table>
             
             
            </div>
          </dl>
          <dl className="line_row">
            <dt>
              <span className="tit">결제까지 완료해주시기 바랍니다. 결제 다음 이메일 전송</span>
            </dt>
            <div>
            <button type="button" className="btn btn-primary">
               결제
                 </button>
            </div>
          </dl>
        </div>
      </div>

     
       
    </div>

     
     
     

    </>
  );
}

export default Boardingpass;
