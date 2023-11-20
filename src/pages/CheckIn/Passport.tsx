import React, { useEffect } from 'react'
import initScripts from '../../assets/js/scripts';
import initCustom from '../../assets/js/custom';

function Passport() {
    useEffect(() => {
        initScripts();
        initCustom();
      }, []);
  return (
    <>
   {/* 여권정보입력  */}
   <div className="row">
                  <div className="col-12">
                    <form className="form">
                      <div className="row mb-2">

                      <div className="col-sm-12 col-md-6 mb-3 mb-lg-0 col-lg-5">
                          <input
                            name=""
                            type="type"
                            className="form-control"
                            placeholder="국적"
                          />
                        </div>
                        
                        <div>
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

                        <div className="col-sm-12 col-md-6 mb-3 mb-lg-0 col-lg-3">
                          <input
                            type="date"
                            className="form-control"
                            placeholder="생년월일"
                          />
                        </div>

                        <div className="col-sm-12 col-md-6 mb-3 mb-lg-0 col-lg-5">
                          <input
                            name=""
                            type="type"
                            className="form-control"
                            placeholder="여권발급국가"
                          />
                        </div>

                      <div className="col-sm-12 col-md-6 mb-3 mb-lg-0 col-lg-5">
                          <input
                            name=""
                            type="type"
                            className="form-control"
                            placeholder="여권번호"
                          />
                        </div>
                       
                     
                        <div className="col-sm-12 col-md-6 mb-3 mb-lg-0 col-lg-3">
                          <input
                            type="date"
                            className="form-control"
                            placeholder="여권 만료일 "
                          />
                        </div>
                      </div>
                      <div className="row align-items-center">
                        <div className="col-sm-12 col-md-6 mb-3 mb-lg-0 col-lg-4">
                          <input
                            type="submit"
                            className="btn btn-primary btn-block"
                            value="조회하기"
                          />
                        </div>
                      </div>
                    </form>
                  </div>
                </div>
          {/* 승객정보입력  */}
    </>
  )
}

export default Passport