package chapter12.sec01.verify.exam03;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * packageName : chapter12.sec01.verify.exam03
 * fileName : Faq
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
public class Faq {
//    TODO: 속성
    private int fid;
    private String subject;
    private String text;

//    TODO: 기본 생성자, 풀 속성 생성자

    public Faq() {
    }

    public Faq(int fid, String subject, String text) {
        this.fid = fid;
        this.subject = subject;
        this.text = text;
    }

    public int getFid() {
        return fid;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }
}
