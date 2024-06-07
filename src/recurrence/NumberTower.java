package recurrence;

// 例3.1 数塔问题
public class NumberTower {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[101][101];

        a[1][1] = 7;
        a[2][1] = 3; a[2][2] = 8;
        a[3][1] = 8; a[3][2] = 1; a[3][3] = 0;
        a[4][1] = 2; a[4][2] = 7; a[4][3] = 4; a[4][4] = 4;
        a[5][1] = 4; a[5][2] = 5; a[5][3] = 2; a[5][4] = 6; a[5][5] = 5;

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.println("i: " + i + " j: " + j);
                System.out.println("a[" + (i + 1) + "][" + j + "]: " + a[i + 1][j]);
                System.out.println("a[" + (i + 1) + "][" + (j + 1) + "]: " + a[i + 1][j + 1]);
                System.out.println("a[" + i + "][" + j + "] origin: " + a[i][j]);
                if (a[i + 1][j] >= a[i + 1][j + 1]) {
                    a[i][j] += a[i + 1][j];
                } else {
                    a[i][j] += a[i + 1][j + 1];
                }
                System.out.println("a[" + i + "][" + j + "] now: " + a[i][j]);
                System.out.println();
            }
        }

        System.out.println(a[1][1]);
    }
}
