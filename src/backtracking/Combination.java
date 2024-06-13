package backtracking;

import java.util.Arrays;
// 例5.2
public class Combination {

    static int num = 0;
    static int[] a = new int[10001];
    static boolean[] b = new boolean[10001];
    static int n = 5, r = 4;

    public static void main(String[] args) {
        Arrays.fill(a, 0);
        search(1);
        System.out.println("number=" + num);
    }

    public static void search(int k) {
        for (int i = 1; i <= n; i++) {
            if (!b[i]) {
                a[k] = i;
                b[i] = true;
                if (k == r) {
                    print();
                } else {
                    search(k + 1);
                }
                b[i] = false;
            }
        }
    }

    public static void print() {
        num++;
        for (int i = 1; i <= r; i++) {
            System.out.printf("%3d", a[i]);
        }
        System.out.println();
    }
}

