package beginner;

import etc.ReadInputText;

/**
 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class _2_문자열_정수의_합 {

    public static void main(String[] args) {
        _2_문자열_정수의_합 t = new _2_문자열_정수의_합();
        String num_str = ReadInputText.getInstance().UseBufferedReader();
        System.out.println(t.solution2(num_str));
    }

    public int solution1(String num_str) {
        String[] split = num_str.split("");
        int sum = 0;
        for (String e : split) {
            sum += Integer.parseInt(e);
        }
        return sum;
    }
    //
    public int solution2(String num_str) {
        return num_str.chars().map(c -> c - 48).sum();
    }
}
