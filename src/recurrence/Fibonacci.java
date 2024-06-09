package recurrence;
// 例3.2 斐波那契数列
public class Fibonacci {
    public static void main(String[] args) {
        int f0 = 1, f1 = 1, f2;
        int n = 20;
        System.out.print(f0 + " " + f1 + " ");
        for (int i = 3; i <= n; i++) {
            f2 = f0 + f1;
            System.out.print(f2 + " ");
            f0 = f1;
            f1 = f2;
        }
    }
}

