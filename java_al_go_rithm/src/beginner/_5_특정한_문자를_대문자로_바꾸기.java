package beginner;

/**
 영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때,
 my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class _5_특정한_문자를_대문자로_바꾸기 {
    public static void main(String[] args) {
        _5_특정한_문자를_대문자로_바꾸기 t = new _5_특정한_문자를_대문자로_바꾸기();
        System.out.println(t.solution("programmers","x"));
    }
    public String solution(String my_string, String alp) {
            return my_string.replaceAll(alp,alp.toUpperCase());
    }
}
