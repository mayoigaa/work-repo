package com.example.controllerexam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * packageName : com.example.controllerexam.model
 * fileName : Qna
 * author : GGG
 * date : 2023-10-06
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-06         GGG          최초 생성
 */
// TODO: Lombok 라이브러리 : 유용한 @ 모은 라이브러리
//    @Setter : setter 함수를 만들어 주는 어노테이션
//    @Getter : getter 함수를 만들어 주는 어노테이션
//    @ToString ; toString 재정의 함수를 자동으로 만들어주는 어노테이션
//    AllArgsConstructor : 모든 속성을 가진 생성자 자동 정의
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Qna {
    Integer no;
    String title;
    String content;


}
