package beginner;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요
 */
public class _9_리스트를_문자열로_변환 {

    public static void main(String[] args) {

    }

    public String solution(String[] arr) {
        return String.join("", arr);
    }

    public String solution2(String[] arr) {
            return Arrays.stream(arr).collect(Collectors.joining());
    }
}
