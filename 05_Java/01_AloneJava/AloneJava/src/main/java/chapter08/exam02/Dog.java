package chapter08.exam02;

/**
 * packageName : chapter08.exam02
 * fileName : Dog
 * author : GGG
 * date : 2023-09-22
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-22         GGG          최초 생성
 */
public class Dog implements Soundable{
    @Override
    public String sound() {
        return "멍멍";
    }
}
