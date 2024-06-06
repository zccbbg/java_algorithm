package sort;

public class MergeSort {

    static int[] a = {0, 10, 6, 7, 10, 2, 16, 18, 9}; // 输入数组，a[0] 不使用
    static int[] r = new int[101]; // 辅助数组

    public static void main(String[] args) {
        int n = 8;
        msort(1, n);
        System.out.println("after sort:");
        for (int z = 1; z <= n; z++) {
            System.out.print(a[z] + " ");
        }
        System.out.println();
    }

    static void msort(int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;

        msort(start, mid); // 分解左序列
        msort(mid + 1, end); // 分解右序列
        System.out.println("start: " + start + " mid: " + mid + " end: " + end);

        int innerStart = start, innerMid = mid + 1, k = start; // 接下来合并
        System.out.println("inner start: " + innerStart + " inner mid: " + innerMid + " k: " + k);

        while (innerStart <= mid && innerMid <= end) {
            if (a[innerStart] <= a[innerMid]) {
                r[k] = a[innerStart];
                k++;
                innerStart++;
            } else {
                r[k] = a[innerMid];
                k++;
                innerMid++;
            }
        }

        while (innerStart <= mid) {
            r[k] = a[innerStart];
            k++;
            innerStart++;
        }

        while (innerMid <= end) {
            r[k] = a[innerMid];
            k++;
            innerMid++;
        }

        System.out.print("after inner sort: ");
        for (int i = start; i <= end; i++) {
            a[i] = r[i];
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
}

