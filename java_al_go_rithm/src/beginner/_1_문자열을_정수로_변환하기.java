package beginner;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 return하도록 solution 함수를 완성해주세요.
 */
public class _1_문자열을_정수로_변환하기 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        try{
            while((str = br.readLine()) != null){
                if(str.equals("")) {
                    System.out.println("종료.");
                    return ;
                }
                int result = solution(str);
                System.out.println(result);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    static int solution(String n_str) {
        try {
            return Integer.parseInt(n_str);
        } catch (NumberFormatException ex){
            System.out.println("숫자 범위 초과");
        }
        return 0;
    }
}
