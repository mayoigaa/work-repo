import React, { useState } from "react";
import { Button, Modal } from "react-bootstrap";
import { Link } from "react-router-dom";
import ICheckinstate from "../../types/state/ICheckinstate";


function CheckInState(props: any) {
    const [checkInState, setCheckinstate] = useState(false);
    const [checkStt, setCheckStt] = useState<Array<ICheckinstate>>([]);

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
                <h3 className="modal-title">체크인 상태 </h3>
              </div>
            </Modal.Title>
          </Modal.Header>
    
          <Modal.Body>
            <div className="modal-body">
              <div className="row mx-0">
                <div className="sangmin_reserve_modal_fori_country">
                  {/* 해외 나라 */}
                  <table className="table">
                    {checkStt &&
                      checkStt.map((data) => (
                        // 키값 추가 않하면 react 에서 경고를 추가 : 키는 내부적으로 리액트가 rerending 할때 체크하는 값임
                        <tr key={data.CheckYn}>
                          <td>{data.BagYn}</td>
                        </tr>
                      ))}
    
                    <tr className="airplane">
                      <td scope="col">체크인 상태 </td>
                      <td scope="col">수화물 추가</td>
                      <td scope="col">체크인 등록</td>
                    </tr>
                    <tr>
                      <td scope="col">출발</td>
                      <td> </td>
                      <Link to={"/passport"}>
                        <Button
                          name="checkinbutton"
                          variant="primary"
                          onClick={() => setCheckinstate(true)}
                        >
                          체크인
                        </Button>
                      </Link>
                    </tr>
    
                    <tr>
                      <td scope="col">출도착시간 </td>
                  
                      <td scope="col">좌석배정/체크인 </td>
                    </tr>
                    <tr>
                      <td scope="col">출발</td>
                      <td> </td>
                      <Link to={"/passport"}>
                        <Button
                          name="checkinbutton"
                          variant="primary"
                          onClick={() => setCheckinstate(true)}
                        >
                          체크인
                        </Button>
                      </Link>
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

    export default CheckInState;


