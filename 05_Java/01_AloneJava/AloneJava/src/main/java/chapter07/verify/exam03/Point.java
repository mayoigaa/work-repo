package chapter07.verify.exam03;

/**
 * packageName : chapter07.verify.exam03
 * fileName : Point
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
public class Point {
    //    속성
    int x;
    int y;
    //    생성자
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    //    TODO: 2개 짜리 생성자 Point(매개변수1, 매개변수2)
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void showPoint() {
//        (0,0)
        System.out.println("(" + x + "," + y + ")");
    }
}