package chapter12.sec01.verify.exam07;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName : chapter12.sec01.verify.exam07
 * fileName : HashSetApplication
 * author : GGG
 * date : 2023-09-26
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
// TODO: 연습문제) 실행클래스는 결과는 아래와 같다.
//    Student 객체의 속성 및 중복을 제거하기 위해 재정의해야할 함수를 포함하여
//    Student 객체를 디자인(코딩)하세요
//    결과 :
//       1:홍길동
//       2:신용권
public class HashSetApplication {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

//        HashSet : 키가 중복되었을때 자동으로 중복을 제거해주는 자료구조
//        HashSet : 기존에 값이 있으면 안들어감
        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(1, "홍길동"));

        for(Student student : set) {
            System.out.println(student.getStudentNum() + "-" + student.getName());
        }
    }
}