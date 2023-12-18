package com.example.modelexam.controller.exam05;



import com.example.modelexam.model.Member;
import com.example.modelexam.service.exam05.Member05Service;
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
@RequestMapping("/exam05")
public class Member05Controller {

    //    TODO: MVC의 Model(Service 클래스) 객체 가져오기
    @Autowired
    Member05Service memberService;

    @GetMapping("/member")
    public String getMemberAll(Model model) {
//        TODO: Service 객체의 전체 조회 함수 호출
        List<Member> list = memberService.findAll();
        model.addAttribute("list", list);

//        TODO: 로그 찍기
        log.debug(list.toString());

        return "exam05/member/member_all.jsp";
    }

    @GetMapping("/member/{eno}")
    public String getMemberId(@PathVariable long eno,
                            Model model
    ){
//        TODO : 서비스 상세 조회 호출
        Member member = memberService.findById(eno);
        model.addAttribute("member",member);
        return "exam05/member/member_id.jsp";
    }

    //  todo: 새로운 회원 추가 페이지 열기 함수
    @GetMapping("/member/addition")
    public String addMember() {
        return "exam05/member/add_member.jsp";
    }

    //  todo: db 저장하기 함수
    @PostMapping("/member/add")
    public RedirectView createMember(@ModelAttribute Member member) {
//      todo: 서비스 저장함수 호출
        memberService.save(member);
//      todo: 저장 후 전체조회 url 로 강제 페이지 이동
//        사용법 : new RedirectView("강제이동될url주소")
        return new RedirectView("/exam05/member");
    }

    //  todo: 회원 수정 페이지 열기 함수 : 상세 조회 필요
    @GetMapping("/member/edition/{eno}")
    public String editMember(@PathVariable long eno, Model model) {
//      todo: 1) 상세 조회
        Member member = memberService.findById(eno); // 상세 조회
        model.addAttribute("member", member);
        return "exam05/member/update_member.jsp";
    }

    //  todo: 수정 저장 함수 : 수정 후 전체 조회 페이지로 강제 이동 (리다이렉트)
    @PutMapping("/member/edit/{eno}")
    public RedirectView updateMember(@PathVariable int eno,
                                   @ModelAttribute Member member) {
//        todo: 수정 저장 함수 호출
        memberService.save(member);

        return new RedirectView("/exam05/member");
    }




}