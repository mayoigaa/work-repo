package chapter13.sec01.exam03;

/**
 * packageName : chap12.sec01.exam07
 * fileName : Calculator
 * author : ds
 * date : 2022-10-06
 * description : 공유 객체 ( 2개의 쓰레드에서 공유함수 호출 )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
public class Calculator {
    private int memory; // 계산기 속성

    //    TODO: getter 함수
    public int getMemory() {
        return memory;
    }

    //    TODO: 동시에 (user1, user2) 쓰레드가 이 함수에 접근 못하도록 막기
//         setter 함수 : 숫자 값을 저장
    public void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000); // 2초 지연
        } catch (Exception e) {}
//        TODO: 에러발생시 현재 실행되는 쓰레드 이름 가져오기
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }
}














