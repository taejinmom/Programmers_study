package beginner;

import java.util.Map;
import java.util.function.BiFunction;

/**
 * packageName    : beginner
 * fileName       : _13_조건_문자열
 * author         : Administrator
 * date           : 2024-05-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-06        Administrator       최초 생성
 */
public class _13_조건_문자열 {
    public static void main(String[] args) {
        _13_조건_문자열 t = new _13_조건_문자열();
        System.out.println(t.solution(">","!",41,78));
//        System.out.println(41 < 78);
    }
    public int solution(String ineq, String eq, int n, int m) {
        // Map.of -> Map 객체 초기화 방법
        // 매개변수 2개, return 값 데이터 타입으로 생성 시 정의하기
        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
                ">=", (a, b)/* Integer */ -> a >= b,/* boolean */
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );

        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
    }

    public int solution2(String ineq, String eq, int n, int m) {
        return (">".equals(ineq) ? n > m : n < m) || ("=".equals(eq) ? n == m : false) ? 1 : 0;
    }
}
