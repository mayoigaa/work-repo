package chapter12.sec01.exam02;

import java.util.Objects;

/**
 * packageName : chapter12.sec01.exam02
 * fileName : Board
 * author : GGG
 * date : 2023-09-25
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-25         GGG          최초 생성
 */
public class Board {
    String subject;  // 제목
    String content; // 내용
    String writer;   // 작성자

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(subject, board.subject) && Objects.equals(content, board.content) && Objects.equals(writer, board.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, content, writer);
    }

//    TODO : 편리성 증진 : 함수 재정의 toString() : 객체를 문자열로 변환하는 함수

    @Override
    public String toString() {
        return "["+ subject +", "+ content + ", " + writer + "]";
    }
}
