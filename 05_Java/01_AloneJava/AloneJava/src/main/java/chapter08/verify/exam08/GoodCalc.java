package chapter08.verify.exam08;

/**
 * packageName : chapter08.verify.exam08
 * fileName : GoodCalc
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
public class GoodCalc extends Calculator{
//    alt + insert

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
//            누적합
            sum = sum + a[i];
        }
        return (double) sum / (double) a.length; // 평균
    }
}