package backtracking;

import java.util.Arrays;

// 例5.1 素数环
public class PrimeRing {
    static boolean[] b = new boolean[11];
    static int total = 0;
    static int[] a = new int[11];

    public static void main(String[] args) {
        Arrays.fill(b, false);
        search(1);
        System.out.println(total);  // 输出总方案数
    }

    public static void search(int t) {
        for (int i = 1; i <= 10; i++) {
            if (pd(a[t - 1], i) && !b[i]) {
                a[t] = i;
                b[i] = true;
                if (t == 10) {
                    if (pd(a[10], a[1])) {
                        printSolution();
                    }
                } else {
                    search(t + 1);
                }
                b[i] = false;
            }
        }
    }

    public static void printSolution() {
        total++;
        System.out.print("<" + total + "> ");
        for (int j = 1; j <= 10; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    public static boolean pd(int x, int y) {
        int i = x + y;
        int k = 2;
        while (k <= Math.sqrt(i) && i % k != 0) {
            k++;
        }
        return k > Math.sqrt(i);
    }
}
