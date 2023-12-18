package com.example.modelexam.controller.exam04;


import com.example.modelexam.model.Dept;
import com.example.modelexam.model.Member;
import com.example.modelexam.service.exam04.Member04Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/**
 * packageName : com.example.modelexam.controller.exam01
 * fileName : MemberController
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
@Slf4j
@Controller
@RequestMapping("/exam04")
public class Member04Controller {

    //    TODO: MVC의 Model(Service 클래스) 객체 가져오기
    @Autowired
    Member04Service memberService;

    @GetMapping("/member")
    public String getMemberAll(Model model) {
//        TODO: Service 객체의 전체 조회 함수 호출
        List<Member> list = memberService.findAll();
        model.addAttribute("list", list);

//        TODO: 로그 찍기
        log.debug(list.toString());

        return "exam04/member/member_all.jsp";
    }

    @GetMapping("/member/{eno}")
    public String getMemberId(@PathVariable long eno,
                            Model model
    ){
//        TODO : 서비스 상세 조회 호출
        Member member = memberService.findById(eno);
        model.addAttribute("member",member);
        return "exam04/member/member_id.jsp";
    }

    //  todo: 새로운 회원 추가 페이지 열기 함수
    @GetMapping("/member/addition")
    public String addMember() {
        return "exam04/member/add_member.jsp";
    }

    //  todo: db 저장하기 함수
    @PostMapping("/member/add")
    public RedirectView createMember(@ModelAttribute Member member) {
//      todo: 서비스 저장함수 호출
        memberService.save(member);
//      todo: 저장 후 전체조회 url 로 강제 페이지 이동
//        사용법 : new RedirectView("강제이동될url주소")
        return new RedirectView("/exam04/member");
    }


}