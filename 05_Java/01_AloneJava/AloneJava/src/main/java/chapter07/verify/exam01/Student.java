package chapter07.verify.exam01;

/**
 * packageName : chapter07.verify.exam01
 * fileName : Student
 * author : GGG
 * date : 2023-09-21
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-21         GGG          최초 생성
 */
public class Student extends Person {
    void set() {
        age = 30;        // 부모속성
        name = "홍길동"; // 부모속성
        height = 175; // 부모속성
        setWeight(99); // 부모함수 ( 세터 : alt+insert )
    }
}

