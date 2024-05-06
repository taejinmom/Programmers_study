package beginner;

import java.util.stream.IntStream;

/**
 * packageName    : beginner
 * fileName       : _12_
 * author         : Administrator
 * date           : 2024-05-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-06        Administrator       최초 생성
 */
public class _12_홀짝에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        _12_홀짝에_따라_다른_값_반환하기 t = new _12_홀짝에_따라_다른_값_반환하기();
        System.out.println(t.solution(7));
    }

    public int solution(int n) {
        boolean check = n % 2 == 0;
        int answer = 0;
        System.out.println("check = " + check);
        for(int i = 1; i <= n; i++) {
            if(!check && i % 2 == 1) {

                answer += i;
                System.out.println("i = " + i);
                System.out.println("answer = " + answer);
            }
            if(check && i % 2 == 0){
                answer += i * i;
                System.out.println(i + " * " + i + " = " + i * i);
                System.out.println("answer = " + answer);
            }
        }

        return answer;
    }

    public int solution2(int n) {
        if (n % 2 == 1) {
            return (n + 1) * (n + 1) / 2 / 2;
        } else {
            return 4 * n/2 * (n/2 + 1) * (2 * n/2 + 1) / 6;
        }
    }

    public int solution3(int n) {
        if(n%2 == 0) {
            return IntStream.rangeClosed(1,n).filter(i->i%2==0).map(i->(int) Math.pow(i,2)).sum();
        }
        return IntStream.rangeClosed(1,n).filter(i->i%2==1).sum();
    }
}
