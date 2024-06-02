package beginner;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 정수가 담긴 리스트 num_list가 주어집니다.
 * num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class _17_이어붙힌수 {

    public static void main(String[] args) {
        _17_이어붙힌수 v = new _17_이어붙힌수();
        System.out.println(v.solution(new int[]{3, 4, 5, 2, 1}));
    }

    public int solution(int[] num_list) {
        int answer = 0;
        String hol = "";
        String jjak = "";
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0){
                jjak += num_list[i];
            }else{
                hol += num_list[i];
            }
        }
        return Integer.parseInt(hol) + Integer.parseInt(jjak);
    }
    public int solution2(int[] numList) {
        int answer = Integer.parseInt(
                Arrays.stream(numList)
                        .filter(value -> value % 2 != 0)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining()))
                + Integer.parseInt(
                Arrays.stream(numList)
                        .filter(value -> value % 2 == 0)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining()));

        return Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining())) + Integer.parseInt(Arrays.stream(numList).filter(value -> value % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining()));
    }
}
