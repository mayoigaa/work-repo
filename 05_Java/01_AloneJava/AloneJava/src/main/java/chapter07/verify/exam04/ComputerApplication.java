package chapter07.verify.exam04;

/**
 * packageName : chapter07.verify.exam04
 * fileName : ComputerApplication
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
// 아래 샐행 결과를 보고 Computer 객체를 디자인(코딩)하세요
// 결과 :
//    전원을 켭니다.
//    화면을 켭니다.
//    타이핑을 합니다.
//    전원을 끕니다.
public class ComputerApplication {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.turnOn(); // "전원을 켭니다." 출력
        computer.displayOn(); // "화면을 켭니다." 출력
        computer.typeOn(); // "타이핑을 합니다." 출력
        computer.turnOff(); // "전원을 끕니다." 출력
    }

}