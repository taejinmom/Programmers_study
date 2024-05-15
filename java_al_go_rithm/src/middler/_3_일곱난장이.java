package middler;

import java.util.Arrays;

/**
 * 왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
 * 아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 뛰어난 수학적 직관력을 가지고 있던 백설공주는,
 * 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
 * 아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
 */
public class _3_일곱난장이 {
    static boolean[] list;
    static int[] dwarf;

    public static void main(String[] args) {
        _3_일곱난장이 t = new _3_일곱난장이();
        dwarf = new int[9];
        list = new boolean[9];
        int[] arrays = {25,3,24,19,10,15,21,8,13};
        dwarf = arrays;
        Arrays.sort(arrays);
        getDW(-1, 0);
    }


    private static void getDW(int idx, int acc) {
        if (acc == 100) {
            for (int i = 0; i < 9; i++) {
                if(list[i]) System.out.println(dwarf[i]);
            }
            System.exit(0);
        }
        if(idx >= 8 || acc > 100) {
            return;
        }
        list[idx+1] = true;
        getDW(idx + 1, acc + dwarf[idx+1]);
        list[idx+1] = false;
        getDW(idx + 1, acc);
    }
}


