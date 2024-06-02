package beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
 */
public class _16_원소들의_곱과_합 {
    public static void main(String[] args) {
        _16_원소들의_곱과_합 t = new _16_원소들의_곱과_합();
        System.out.println(t.solution(new int[]{3, 4, 5, 2, 1}));
    }

    public int solution(int[] num_list) {
        int answer = 0;
        List<Integer> streamlist = Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.toList());

        // int[]를 Integer[]로 변환
        Integer[] numArrayInteger = Arrays.stream(num_list).boxed().toArray(Integer[]::new);

        List<Integer> asList = Arrays.asList(numArrayInteger);

        int abs;
        int pow;
        int sum;

        sum = Arrays.stream(num_list).sum();
        pow = (int) Math.pow(sum,2);
        abs = Arrays.stream(num_list).reduce((a,b) -> a*b).getAsInt();

        return pow > abs? 1 : 0;
    }
}
