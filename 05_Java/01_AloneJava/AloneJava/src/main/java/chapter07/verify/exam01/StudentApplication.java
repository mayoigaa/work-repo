package chapter07.verify.exam01;

/**
 * packageName : chapter07.verify.exam01
 * fileName : StudentApplication
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
public class StudentApplication {
    public static void main(String[] args) {
        Student student = new Student();
        student.set();
//        결과 출력
//        age : 나이
//        name : "홍길동"
//        height : 175
//        weight : 99
        System.out.println("age : " + student.age);
        System.out.println("name : " + student.name);
        System.out.println("height : " + student.height);
        System.out.println("weight : " + student.weight);

    }
}
