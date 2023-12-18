package chapter12.sec01.verify.exam04;

/**
 * packageName : chapter12.sec01.verify.exam04
 * fileName : Board
 * author : GGG
 * date : 2023-09-26
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-26         GGG          최초 생성
 */
public class Board {
    //  TODO: 속성
    String title;
    String content;
    //  TODO: 기본생성자, full 속성 생성자
    public Board() {
    }

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }
    //  TODO: getter 함수
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}

