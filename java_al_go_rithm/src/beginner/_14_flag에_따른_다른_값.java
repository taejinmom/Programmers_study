package beginner;

/**
 * packageName    : beginner
 * fileName       : _14_flag에_따른_다른_값
 * author         : Administrator
 * date           : 2024-05-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-06        Administrator       최초 생성
 */
public class _14_flag에_따른_다른_값 {
    public static void main(String[] args) {

    }

    public int solution(int a, int b, boolean flag) {
        return flag? a+b : a-b;
    }
    public int solution2(int a, int b, boolean flag) {
        return a + (flag ? 1 : -1) * b;
    }
}
