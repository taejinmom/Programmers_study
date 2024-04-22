package beginner;

import etc.ReadInputText;

/**
 정수로 이루어진 리스트 num_list가 주어집니다.
 num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */
public class _4_뒤에서_5등위로 {

    public _4_뒤에서_5등위로(double num) {

        System.out.println(solution(num));
    }

    public static void main(String[] args) {
        _4_뒤에서_5등위로 t = new _4_뒤에서_5등위로(Double.parseDouble(ReadInputText.getInstance().UseBufferedReader()));
    }

    public int solution(double flo) {
        return (int) flo;
    }
}
