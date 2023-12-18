package chapter10.sec01.exam01;

/**
 * packageName : chapter10.sec01.exam01
 * fileName : NullApplication
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
public class NullApplication {
    public static void main(String[] args) {
//        TODO: null 발생시키는 코드
        String data = null;
        System.out.println(data.toString()); // null 에러 발생
    }
}