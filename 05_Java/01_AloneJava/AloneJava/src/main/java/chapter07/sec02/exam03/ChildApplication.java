package chapter07.sec02.exam03;



/**
 * packageName : chapter07.sec02.exam03
 * fileName : ChildApplication
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
public class ChildApplication {
    public static void main(String[] args) {
//        다형성 이용 객체 생성
//        TODO: 부모 객체 = 자식 객체
//           부모 클래스 객체 변수 = new 자식생성자();
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
//       TODO: 자식의(child) 고유함수 사용 못함
//        parent.method3(); // x
        
        
//        예제 1) 위에서 다형성을 이용했는데 부득이하게 자식함수와 속성을 사용할 일이 생겼음
//        TODO: 강제형변환해서 자식객체로 원복
        Child child = (Child)parent; // (작은것 -> 큰 것 : 자동), (큰 것-> 작은 것 : 수동)
        child.field2 = "data2"; // 고유 속성 사용
        child.method3(); // 고유 함수 실행
    }
}
