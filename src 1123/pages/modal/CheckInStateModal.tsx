import React, { useState } from "react";
import { Button, Modal } from "react-bootstrap";
import { Link } from "react-router-dom";

import ICheckin from "../../types/checkin/ICheckin";

function CheckInStateModal(props: any) {
  const [checkInState, setCheckinstate] = useState(false);
  const [checkStt, setCheckStt] = useState<Array<ICheckin>>([]);

  return (
    <Modal
      {...props}
      size="lg"
      aria-labelledby="contained-modal-title-vcenter"
      centered
    >
      <Modal.Header closeButton>
        <Modal.Title id="contained-modal-title-vcenter">
          <div className="reserve_modal_header modal-header">
            <h3 className="modal-title">탑승객 선택</h3>
          </div>
        </Modal.Title>
      </Modal.Header>

      <Modal.Body>
        <div className="modal-body">
          <div className="row mx-0">
            <div className="sangmin_reserve_modal_fori_country">
              
              <table className="table">
                {checkStt &&
                  checkStt.map((data) => (
                    // 키값 추가 안하면 react 에서 경고를 추가 : 키는 내부적으로 리액트가 rerending 할때 체크하는 값임
                    <tr key={data.CheckYn}>
                      <td>{data.BagYn}</td>
                    </tr>
                  ))}

                <tr>
                  <td scope="col">승객 이름 </td>
                  <td scope="col">체크인 상태</td>
                  <td scope="col">체크인 등록</td>
                </tr>
                <tr>
                  <td scope="col">예약자</td>
                  <td scope="col">체크인 미완료</td>
                  <td scope="col">
                    <div className="form-check form-check-inline">
                      <input
                        className="form-check-input"
                        type="checkbox"
                        id="inlineCheckbox1"
                        value="option1"
                      />
                      <label
                        className="form-check-label"
                        htmlFor="inlineCheckbox1"
                      >
                        선택하기
                      </label>
                    </div>
                  </td>
                </tr>
                <tr>
                  <td scope="col">승객1</td>
                  <td scope="col">체크인 미완료</td>
                  <td scope="col">
                    <div className="form-check form-check-inline">
                      <input
                        className="form-check-input"
                        type="checkbox"
                        id="inlineCheckbox1"
                        value="option1"
                      />
                      <label
                        className="form-check-label"
                        htmlFor="inlineCheckbox1"
                      >
                        선택하기
                      </label>
                    </div>
                  </td>
                </tr>
               

                
                <tr>
                  <td scope="col"></td>
                  <td></td>
                  <td>
                    {" "}
                    <Link to={"/passport"}>
                      <Button
                        name="checkinbutton"
                        variant="primary"
                        onClick={() => setCheckinstate(true)}
                      >
                        체크인
                      </Button>
                    </Link>
                  </td>
                </tr>
              </table>
            </div>
          </div>
        </div>

        <div className="checkinstateButton"></div>
      </Modal.Body>
      {/* <Modal.Footer>
          <Button onClick={props.onHide}>Close</Button>
        </Modal.Footer> */}
    </Modal>
  );
}

export default CheckInStateModal;