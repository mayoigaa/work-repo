package com.example.jpaexam.service;


import com.example.jpaexam.model.Dept;
import com.example.jpaexam.model.Emp;
import com.example.jpaexam.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.jpaexam.service
 * fileName : EmpService
 * author : GGG
 * date : 2023-10-16
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-16         GGG          최초 생성
 */
@Service
public class EmpService {
    @Autowired
    EmpRepository empRepository; // DI 객체 가져오기

    /** 전체조회 */
    public List<Emp> findAll(){
        List<Emp> list = empRepository.findAll(); //db 전체 조회 함수 호출
        return list;
    }

    /** 상세조회 (1건 조회)*/
    public Optional<Emp> findById(int eno){
        Optional<Emp> optionalEmp =empRepository.findById(eno);

        return optionalEmp;
    }
    /** 저장함수 */
    public Emp save(Emp emp){
//        todo : jpa 저장함수 호출 (기본키 없으면 insert, 없으면 update)
        Emp emp2 = empRepository.save(emp);

        return emp2; // 저장된 부서객체
    }

    /** 삭제 함수 */
    public boolean removeById(int eno){
        if(empRepository.existsById(eno)){
            empRepository.deleteById(eno); //DB 삭제 (eno)
            return true;
        }
        return false;
    }



}
