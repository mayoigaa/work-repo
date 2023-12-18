package chapter06.sec04.verify.exam03;

/**
 * packageName : chapter06.sec04.verify.exam03
 * fileName : MemberService
 * author : GGG
 * date : 2023-09-20
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-20         GGG          최초 생성
 */
public class MemberService {

    boolean login (String id, String pw) {

        if(id.equals("hong") && pw.equals("12345")){
            return true;

        }else{
            return false;
        }

        }
        void logout (String id) {
            System.out.println(id + "이 로그아웃 되었습니다.");
        }
}
