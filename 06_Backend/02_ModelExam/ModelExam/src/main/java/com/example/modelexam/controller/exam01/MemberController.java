package com.example.modelexam.controller.exam01;

import com.example.modelexam.model.Member;
import com.example.modelexam.service.exam01.exam02.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/exam01")
public class MemberController {

    //    TODO: MVC의 Model(Service 클래스) 객체 가져오기
    @Autowired
    MemberService memberService;

    @GetMapping("/member")
    public String getMemberAll(Model model) {
//        TODO: Service 객체의 전체 조회 함수 호출
        List<Member> list = memberService.findAll();
        model.addAttribute("list", list);

//        TODO: 로그 찍기
        log.debug(list.toString());

        return "exam01/member/member_all.jsp";
    }

}