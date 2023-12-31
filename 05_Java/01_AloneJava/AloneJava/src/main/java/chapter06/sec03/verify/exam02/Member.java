package chapter06.sec03.verify.exam02;

/**
 * packageName : chapter06.sec03.verify.exam02
 * fileName : Member
 * author : GGG
 * date : 2023-09-20
 * description : 회원 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class Member {
    String id;  // 회원 id
    String name; // 회원명

    public Member(){};

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
