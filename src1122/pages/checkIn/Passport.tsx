import React, { useEffect, useState } from "react";
import initScripts from "../../assets/js/scripts";
import initCustom from "../../assets/js/custom";
import { Accordion } from "react-bootstrap";
import { Button } from "@mui/material";

function Passport() {
  // todo: 장바구니 물품 개수를 저장할 변수
  let [bagCount, setBagCount] = useState<number>(0);

  useEffect(() => {
    initScripts();
    initCustom();
  }, []);

  //  todo: 증가 함수
  const increaseCount = () => {
    bagCount += 1;
    setBagCount(bagCount); // 현재 증가값 저장
  };

  //  todo: 감소 함수
  const decreaseCount = () => {
    if (bagCount > 0) {
      bagCount -= 1;
      setBagCount(bagCount); // 현재 감소값 저장
    }
  };

 


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
                        required
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
                    <div
                      className="invalid-feedback"
                      // onClick={()=>passportInfo()}
                    >
                      * 필수입력
                    </div>
                  </div>

                  <div className="col-sm-10 col-md-3 mb-3 mb-lg-2 col-lg-3">
                    <div className="is-invalid">
                      <select
                        name=""
                        id=""
                        className="form-control custom-select"
                        required
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
                        placeholder="YYYY.MM.DD"
                        required
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
                        required
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

                  <div className="col-sm-10 col-md-6 mb-3 mb-lg-2 col-lg-3">
                    <div className="is-invalid">
                      <input
                        name=""
                        type="type"
                        className="form-control"
                        placeholder="여권번호"
                        required
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
                        required
                      />
                    </div>
                    <div className="invalid-feedback">* 필수입력</div>
                  </div>
                  <div className="col-sm-10 col-md-6 mb-3 mb-lg-2 col-lg-2">
                    <button type="button" className="btn btn-outline-dark">
                      승객 추가
                    </button>
                  </div>
                </div>
              </div>
            </div>
            {/* 여권정보입력  */}
          </Accordion.Body>
        </Accordion.Item>

        {/* 좌석지정 */}
        <Accordion.Item eventKey="1">
          <Accordion.Header>좌석 지정 #2</Accordion.Header>
          <Accordion.Body>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
          </Accordion.Body>
        </Accordion.Item>
        {/* 좌석지정 */}

        {/* 수화물 사전 구매  */}
        <Accordion.Item eventKey="2">
          <Accordion.Header>수화물추가 #3</Accordion.Header>
          <Accordion.Body>
            <div className="bagage">
              <h5> 예약 번호 : </h5>
              <table className="table">
                <tr>
                  <td scope="col">예약자 </td>
                  <td scope="col">수화물 추가</td>
                  <td scope="col">금액</td>
                </tr>
                <tr>
                  <td scope="col"></td>
                  <td scope="col"><div
                      className="btn-group-col"
                      role="group"
                      aria-label="Basic outlined example"
                    >
                      <button
                        type="button"
                        className="btn btn-outline-secondary opacity-50"
                        onClick={decreaseCount}
                      >
                        -
                      </button>

                      <button
                        type="button"
                        className="btn btn-outline-dark"
                        disabled
                      >
                        {bagCount}
                      </button>

                      <button
                        type="button"
                        className="btn btn-outline-secondary opacity-50"
                        onClick={increaseCount}
                      >
                        +
                      </button>
                    </div></td>
                  <td scope="col">ㅇ</td>
                </tr>

                <tr>
                  <td scope="col">일행 </td>
                  <td scope="col">수화물 추가</td>
                  <td scope="col">금액</td>
                </tr>

                <tr>
                  <td scope="col"></td>
                  <td scope="col">
                   
                    <div
                      className="btn-group-col"
                      role="group"
                      aria-label="Basic outlined example"
                    >
                      <button
                        type="button"
                        className="btn btn-outline-secondary opacity-50"
                        onClick={decreaseCount}
                      >
                        -
                      </button>

                      <button
                        type="button"
                        className="btn btn-outline-dark"
                        disabled
                      >
                        {bagCount}
                      </button>

                      <button
                        type="button"
                        className="btn btn-outline-secondary opacity-50"
                        onClick={increaseCount}
                      >
                        +
                      </button>
                    </div>
                  </td>
                  <td scope="col">ㅇ</td>
                </tr>
                <tr>
                  <td></td>
                  <td>
                    <strong>총수량</strong>
                  </td>
                  <td>
                    <strong>금액</strong>
                  </td>
                </tr>
              </table>
            </div>
          </Accordion.Body>
        </Accordion.Item>
        {/* 수화물 사전 구매  */}

        <Accordion.Item eventKey="3">
          <Accordion.Header>탑승권 전송 #4</Accordion.Header>
          <Accordion.Body>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
          </Accordion.Body>
        </Accordion.Item>
      </Accordion>
    </>
  );
}

export default Passport;
