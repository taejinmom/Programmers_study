package beginner;

import etc.ReadInputText;

/**
 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
 */
public class _3_정수부분 {

    public _3_정수부분(double num) {
        System.out.println(solution(num));
    }

    public static void main(String[] args) {
        _3_정수부분 t = new _3_정수부분(Double.parseDouble(ReadInputText.getInstance().UseBufferedReader()));
    }

    public int solution(double flo) {
        return (int) flo;
    }
}
