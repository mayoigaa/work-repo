package chapter07.sec01.exam04;

/**
 * packageName : chapter07.sec01.exam04
 * fileName : DmbCellPhoneApplication
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
public class DmbCellPhoneApplication {
    public static void main(String[] args) {
//        객체 생성 : Dmb 폰 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("애플", "검정", 10);
        System.out.println("모델 : "+ dmbCellPhone.model); //부모 속성
        System.out.println("색상 : "+ dmbCellPhone.color); //부모 속성
        System.out.println("채널 : "+ dmbCellPhone.channel); //부모 속성

//       전화 걸기
        dmbCellPhone.powerOn(); //전원켜기
        dmbCellPhone.bell();    //통화음
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요~ 반갑습니다");
        dmbCellPhone.hangUp(); // 전화 끊기

//        tv 수신 : 자식 기능
        dmbCellPhone.turnOnDmb(); // tv 켜기
        dmbCellPhone.changeChannelDmb(12); // 채널 돌리기
        dmbCellPhone.turnOffDmb(); // tv 끄기

    }
}
