package chapter07.verify.exam02;

/**
 * packageName : chapter07.verify.exam02
 * fileName : ColorPoint
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
public class ColorPoint extends Point {
    String color; // 점의 색

    public void setColor(String color) {
        this.color = color;
    }

    void showColorPoint() {
        System.out.print(color); // 색깔 출력
        showPoint(); // 부모클래스의 함수 호출 (3,4)
    }
}



