package chapter5;

/**
 * packageName : chapter5
 * fileName : Sec0501
 * author : GGG
 * date : 2023-09-19
 * description : 참조 자료형과 참조변수
 * 요약 : 
 *         기본 자료형 : int(4), long(8), float(4), double, boolean 자료형
 *         => 스택 방 : 값이 그대로 저장됨
 *         참조 자료형 : String(문자열), 배열, 객체
 *         => 스택 방 : 주소 (방 번호) 값만 저장되고
 *         => 힙 방 : 값이 저장됨
 *         JVM(Java Virtual Machine) : 자바 가상 머신 :jdk (자바 가상 머신)
 *         역할 : linux/windows(운영체제) 모든 곳에서 실행할수 있게 만드는 프로그램
 *         비교연산자(==) : 기본자료형에서는 값을 비교하고
 *                        참조자료형에서는 주소(방번호) 비교하게 됨
 *                        (스택방의 저장된 값을 비교함)
 *
 *         null 포인트 에러(예외) : 프로그램 강제 비정상 중단함
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-19         GGG          최초 생성왜
 */
public class Sec0501 {
    /**
     * 비교 연산자(==) 와 equals 함수 예제
     */
    public void  stringEqualExam() {
//        참조 자료형
//        참조 자료형 객체변수 = new 생성자함수();
//        메모리에 랜덤한 주소(방번호)값으로 생성됨
        String strVal1 = new String("신민철");
        String strVal2 = new String("신민철");

//        주소(방번호) 비교 : 개발 

        if(strVal1 == strVal2) {
            System.out.println("두개의 주소가 같음");
        }else{
            System.out.println("두 개의 주소가 다름 ");
        }
        
//        equals() 함수 사용 : 값을 비교하는 함수
        if(strVal1.equals(strVal2)== true) {
            System.out.println("두 개의 값이 같음");
        }

//         nulll 포인터 예외(에러)
//        배열
         int[] intArray = null;
        intArray[0] = 10;   //0번지 방에 10번을 넣으니 null 에러 발생

//         객체에서 null 에러
        String str = null;  // 권장코딩 : String str="";
//         문자열의 길이를 가져오는 함수 : 문자열.length()
        System.out.println("총 문자수: " + str.length()); //null 에러발생

    }
}
