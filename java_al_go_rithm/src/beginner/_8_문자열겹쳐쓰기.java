package beginner;

/**
 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열
 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class _8_문자열겹쳐쓰기 {
    public static void main(String[] args) {
        _8_문자열겹쳐쓰기 t = new _8_문자열겹쳐쓰기();
        String a = t.solution2("Program29b8UYP","merS123",7);
        System.out.println("> " + a);
        System.out.println("> " + "Program29b8UYP".substring(0,7).concat("merS123"));
    }
    public String solution(String my_string, String overwrite_string, int s) {
        try {
            String chgWord = my_string.substring(s, s + overwrite_string.length());
            return my_string.replaceAll(chgWord,overwrite_string);
        }catch (IndexOutOfBoundsException e ) {
            return my_string.substring(0,s).concat(overwrite_string);
        }
    }
    public String solution2(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        return answer;
    }
}
