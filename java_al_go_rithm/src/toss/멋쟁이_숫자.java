package toss;

import java.util.*;

/**
 * packageName    : toss
 * fileName       : 구현사항
 * author         : Administrator
 * date           : 2024-04-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-27        Administrator       최초 생성
 */
public class 멋쟁이_숫자 {
    public static void main(String[] args) {
        멋쟁이_숫자 t = new 멋쟁이_숫자();
        t.solution("12223");
    }
    public void solution(String s) {
        List<String> strings = Arrays.stream(s.split("")).toList();

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String str : strings) {
            Integer count = map.get(str);
            if (count == null) {
                map.put(str, 1);
            } else {
                map.put(str, count + 1);
            }
        }

        List<String> resultList = new ArrayList<>(map.keySet());

        Integer maxVal = Collections.max(map.values());

        for(int i = 0; i < maxVal; i++){

        }
        System.out.println("maxVal = " + maxVal);
    }
}
