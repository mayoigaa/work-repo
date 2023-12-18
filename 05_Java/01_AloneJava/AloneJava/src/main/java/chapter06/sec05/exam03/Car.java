package chapter06.sec05.exam03;

/**
 * packageName : chapter06.sec05.exam03
 * fileName : Car
 * author : GGG
 * date : 2023-09-21
 * description : 정적(공유) 변수 속성/함수 사용히 주의점
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-21         GGG          최초 생성
 */
public class Car {
    int speed; // 속성
    
    void run(){
        System.out.println(speed + "으로 달립니다");
    }

    public static void main(String[] args) {
//        this.speed; // 일반 속성 사용 불가, 에러 발생
//        같은 클래스라도 객체를 생성해서 속성을 사용해야함
        Car car = new Car();
        car.speed = 60;
        car.run();

    }
    
}
