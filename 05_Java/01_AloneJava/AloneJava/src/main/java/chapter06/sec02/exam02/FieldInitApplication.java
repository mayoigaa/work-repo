package chapter06.sec02.exam02;

import com.sun.jdi.Field;

/**
 * packageName : chapter06.sec02.exam02
 * fileName : FieldInitApplication
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
public class FieldInitApplication {
    public static void main(String[] args) {
//        객체 생성 : new 연산자(힙방에 해당객체를 생성함)
//        TODO: 클래스명 명명법 : 첫글자 대문자 나머지 소문자, 단어사이는 대문자(파스칼표기법)
//       사용법 : 클래스명 객체변수명 = new 생성자함수();
        FieldInit fieldinit = new FieldInit();

//        TODO: 예제: fieldInit 객체 변수의 모든 속성 출력하세요
        System.out.println("byte: " + fieldinit.bField);
        System.out.println("short: " + fieldinit.sField);
        System.out.println("int: "+ fieldinit.iField);
        System.out.println("long:" + fieldinit.lField);
        System.out.println("float: " + fieldinit.fField);
        System.out.println("double: " + fieldinit.dField);
        System.out.println("char: " + fieldinit.cField);
        System.out.println("boolean: " + fieldinit.boField);
        System.out.println("String: " + fieldinit.strField);
        System.out.println("int[]: " + fieldinit.arrField);

    }
}
