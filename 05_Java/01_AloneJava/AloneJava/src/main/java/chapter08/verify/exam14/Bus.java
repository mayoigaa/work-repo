package chapter08.verify.exam14;

/**
 * packageName : chapter08.verify.exam14
 * fileName : Bus
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
public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
    void checkFare(){
        System.out.println("승차요금을 체크합니다.");
    }
}
