package beginner;

import java.util.stream.IntStream;

/**
 문자열 배열 strArr가 주어집니다. 모든 원소가 알파벳으로만 이루어져 있을 때,
 배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.
 */
public class _7_배열에서_문자열_대소문자_변환하기 {

    public static void main(String[] args) {
        _7_배열에서_문자열_대소문자_변환하기 t = new _7_배열에서_문자열_대소문자_변환하기();
        String[] a = t.solution(new String[]{"AAA","BBB","CCC","DDD"});
        for (String e : a) {
            System.out.println("e = " + e);
        }
    }
    public String[] solution(String[] strArr) {
        String[] answer = {};
        for (int i = 0; i < strArr.length; i++) {
            if(i % 2 == 0){
                strArr[i] = strArr[i].toLowerCase();
            }else{
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }

    public String[] newSolution(String[] strArr) {
        return IntStream.range(0, strArr.length).mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase()).toArray(String[]::new);
    }
}
