package chapter07.verify.exam06;

/**
 * packageName : chapter07.verify.exam06
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
        Student student = new Student("홍길동");

        student.setId("1234567");

        System.out.println(student.getName());  // 홍길동
        System.out.println(student.getId());    // 1234567
    }
}
