package chapter12.sec01.exam02;

import java.util.List;
import java.util.Vector;

/**
 * packageName : chapter12.sec01.exam02
 * fileName : BoardApplication
 * author : GGG
 * date : 2023-09-25
 * description : Board 객체를 저장하는 Vector
 * 요약 :
 *     Vector : 멀티쓰레드 환경에서 사용하는 자료구조, ArrayList 거의 유사
 *              (병렬 처리 : 속도 향상 (장점) , 코딩 복잡도 증가(동기화 문제 등))
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-25         GGG          최초 생성
 */
public class BoardApplication {
    public static void main(String[] args) {
//        백터 객체 생성 ; 다형성 이용
//        TODO : Vector의 부모 :
//         List(add(): 추가, get(): 조회, set():수정, remove():삭제)
        List<Board> list = new Vector<>();
//        객체 추가 
        list.add(new Board("제목1", "내용1","글쓴이1"));
        list.add(new Board("제목2", "내용2","글쓴이2"));
        list.add(new Board("제목3", "내용3","글쓴이3"));
        list.add(new Board("제목4", "내용4","글쓴이4"));
        list.add(new Board("제목5", "내용5","글쓴이5"));
        System.out.println(list); // 속성 : toString() :list에서 생략해도 됨 (자동 실행)

//         삭제 2건
        list.remove(2); // 2번 삭제 후 자동으로 자료가 당겨짐
        list.remove(3);

        System.out.println(list); // 결과 출력
    }
}
