package com.example.modelexam.service.exam02;


import com.example.modelexam.dao.MemberDao;
import com.example.modelexam.model.Dept;
import com.example.modelexam.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.modelexam.service.exam01
 * fileName : MemberService
 * author : GGG
 * date : 2023-10-10
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-10         GGG          최초 생성
 */
@Service
public class Member02Service {

//    TODO:  db 접근 함수들이 있는 객체 : memberDao
    @Autowired
    MemberDao memberDao; // 가짜 DB에 접근하는 객체

    /**
     * 전체 조회 함수 : selectAll()(DAO 객체 함수) 호출
     *
     * @return
     */
    public List<Member> findAll() {
//      TODO: deptDao.selectAll() : db 조회 함수 호출
        List<Member> list = memberDao.selectAll();

        return list;
    }

    /**
     * id(기본키)로 조회 : 상세조회(1건조회)
     * @param eno
     * @return
     */
    public Member findById(long eno) {
//       todo: db 상세조회(1건조회) 함수 호출
//          id(기본키)로 조회
        Member member = memberDao.selectById(eno);

        return member;
    }
}