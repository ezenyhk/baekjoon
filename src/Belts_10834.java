package WIP;

import java.util.Arrays;
import java.util.Scanner;

public class Belts_10834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] type = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            type[i] = sc.nextInt() == 0 ? 1 : -1; // -1 means reverse
        }
        int[] result = new int[n - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = getRatioIfARoundOne(a[i], b[i], type[i], a[i + 1], b[i + 1], type[i + 1]);
        }
        System.out.println(Arrays.toString(result));
    }

    private static int getRatioIfARoundOne(int a1, int b1, int type1, int a2, int b2, int type2) {
        float a1Ratio = getRatio(a1, b1, type1);
        float a2Ratio = getRatio(a2, b2, type2);
        return 1; // 구한 비를 이용해서 다음 값을 구하시오
    }

    private static float getRatio(float a1, int b1, int type1) {
        return b1 / a1 * (type1);
    }
}