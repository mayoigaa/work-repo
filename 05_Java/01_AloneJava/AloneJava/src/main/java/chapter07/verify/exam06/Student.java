package chapter07.verify.exam06;

/**
 * packageName : chapter07.verify.exam06
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
    String id;

//    기본 생성자
    public Student() {
    }

    //   생성자

    public Student(String name) {
        super(name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
