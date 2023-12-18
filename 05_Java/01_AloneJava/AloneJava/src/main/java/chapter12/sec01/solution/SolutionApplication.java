package chapter12.sec01.solution;

import java.util.List;

/**
 * packageName : chapter12.sec01.solution
 * fileName : SolutionApplication
 * author : GGG
 * date : 2023-09-25
 * description :
 * 요약 :
 * 입출력 예
 * n	k	result
 * 10	3	[3, 6, 9]
 * 15	5	[5, 10, 15
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-25         GGG          최초 생성
 */
public class SolutionApplication {
    public static void main(String[] args) {

        Solution solution = new Solution();
       List<Integer> answer = solution.solution100(10,3);
        System.out.println(answer);
    }
}
