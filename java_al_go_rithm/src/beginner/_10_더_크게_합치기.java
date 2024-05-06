package beginner;

/**
 * packageName    : beginner
 * fileName       : _10_더_크게_합치기
 * author         : Administrator
 * date           : 2024-05-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-05        Administrator       최초 생성
 */
public class _10_더_크게_합치기 {
    public static void main(String[] args) {
        _10_더_크게_합치기 t = new _10_더_크게_합치기();
        System.out.println(t.solution2(89,8));
    }

    public int solution(int a, int b) {
        int answer = 0;
        int aConVal = Integer.parseInt("" + a+b);
        int bConVal = Integer.parseInt("" + b+a);

        if(aConVal > bConVal){
            answer =  aConVal;
        }else if (aConVal < bConVal){
            answer =  bConVal;
        }else {
            answer =  aConVal;
        }
        return answer;
    }
    // 이건 어떠려나..
    public int solution2(int a, int b) {
        return Math.max(Integer.valueOf(""+a+b), Integer.valueOf(""+b+a));
    }
}
