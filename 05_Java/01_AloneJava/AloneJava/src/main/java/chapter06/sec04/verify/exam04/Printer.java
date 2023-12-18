package chapter06.sec04.verify.exam04;

/**
 * packageName : chapter06.sec04.verify.exam04
 * fileName : Printer
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
public class Printer {
//   TODO: 속성, 생성자함수, 함수(메소드)
//    속성, 생성자함수 생략
//     함수 : 오버로딩 가능
//    .println(10), .println(true), .println(5.7), .println("홍길동")
    static void println(int a) {

        System.out.println("공유함수(int): " + a);
    }
    static void println(boolean b){
        System.out.println("공유함수(boolean): " +b);

    }
    static void println(double c){
        System.out.println("공유함수(double): " + c);

    }
    static  void println(String d){
        System.out.println("공유함수(String): " + d);

    }

}
