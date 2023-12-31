package com.example.controllerexam.controller.exam07;

import com.example.controllerexam.model.Board;
import com.example.controllerexam.model.Member;
import com.example.controllerexam.model.Qna;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : com.example.controllerexam.controller.exam07
 * fileName : ObjectRequestBodyController
 * author : GGG
 package com.example.controllerexam.controller.exam07;

 import com.example.controllerexam.model.Board;
 import com.example.controllerexam.model.Member;
 import com.example.controllerexam.model.Qna;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

 import java.util.ArrayList;
 import java.util.List;

 /**
 * packageName : com.example.controllerexam.controller.exam07
 * fileName : ObjectRequestBodyController
 * author : GGG
 * date : 2023-10-06
 * description : @RequestBody , @RestController, @PostMapping
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-06         GGG          최초 생성
 */
@RestController
@RequestMapping("/exam07")
public class ObjectRequestBodyController {

    //  TODO: 예제 1) 데이터를 입력받아(insert) 화면에 출력하기
//   CRUD      : C(Create), R(Read)
//   R(select) : @GetMapping("url")
//   C(insert) : @PostMapping("url")함수명(@RequestBody 객체명){}
//   참고(U(update)) : @PutMapping("url")
//   참고(D(delete)) : @DeleteMapping("url")
//   사용법 : @PostMapping("/object-variable")
//    @RequestBody 객체명 : (vs @ModelAttribute 객체명 : jsp 사용 )
    @PostMapping("/object-variable")
    public List<Member> getObjectRequestBody(
            @RequestBody Member member
    ) {
        List<Member> list = new ArrayList<>();
        list.add(member);
        return list;
    }

    //  TODO: 연습 1) Qna 클래스를 만들어서 아래 데이터를 추가해서
//                REST Client 프로그램으로 출력해 보세요.(@PostMapping 사용)
//            url : /example01
//    결과 :
//       [
//           {
//               "no": 1,
//               "title": "제목"
//               "content": "내용"
//           },
//       ]
    @PostMapping("/example01")
    public List<Qna> getExample01(
            @RequestBody Qna qna
    ) {
        List<Qna> list = new ArrayList<>();
        list.add(qna);
        return list;
    }

    //    TODO: 연습 2) Board 클래스에 아래와 같이 출력되도록 레스트클라이언트에 출력해 보세요. (@PostMapping 사용)
//              단 REST API 는 Get 방식을 사용하고 URL 전달 방식은 파라메터 방식을 사용하세요.
//        url : /example02
//      결과 :
//       [
//           {
//          "no": 10,
//          "title": "제목",
//          "content": "내용",
//          "count" : "1"
//           }
//       ]
    @PostMapping("/example02")
    public List<Board> getExample02(
            @RequestBody Board board
    ) {
        List<Board> list = new ArrayList<>();
        list.add(board);
        return list;
    }
}


