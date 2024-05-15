package middler;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
 */
public class _2_등차수열 {

    public static void main(String[] args) {
        boolean[] included = {true, false, false, true, true};
        int a = 3;
        int d = 4;
        _2_등차수열 t = new _2_등차수열();
        System.out.println(t.solution(a,d,included));
    }

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] nums = new int[included.length];


        for (int i = 0; i < included.length; i++){
            nums[i] = i != 0 ? nums[i-1] + d : a;

            if(included[i]){
                answer += nums[i];
            }
        }
        return answer;
    }

    public int solution2(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length).map(idx -> included[idx]? a+(idx*d) : 0).sum();
    }
}
