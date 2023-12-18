package com.example.modelexam.controller.exam03;


import com.example.modelexam.model.Member;
import com.example.modelexam.service.exam03.Member03Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/exam03")
public class Member03Controller {

    //    TODO: MVC의 Model(Service 클래스) 객체 가져오기
    @Autowired
    Member03Service memberService;

    @GetMapping("/member")
    public String getMemberAll(Model model) {
//        TODO: Service 객체의 전체 조회 함수 호출
        List<Member> list = memberService.findAll();
        model.addAttribute("list", list);

//        TODO: 로그 찍기
        log.debug(list.toString());

        return "exam03/member/member_all.jsp";
    }

    @GetMapping("/member/{eno}")
    public String getMemberId(@PathVariable long eno,
                            Model model
    ){
//        TODO : 서비스 상세 조회 호출
        Member member = memberService.findById(eno);
        model.addAttribute("member",member);
        return "exam03/member/member_id.jsp";
    }

    //    TODO: @ResponseBody : 함수의 결과로 json 데이터를 리턴하고자
//           할 때 사용하는 어노테이션
//     사용법 : 함수의 위에 붙이기
    @PostMapping("/member")
    @ResponseBody
    public List<Member> createMember(
            @RequestBody Member member
    ){
        List<Member> list = memberService.save(member);
        return list;

    }
}
