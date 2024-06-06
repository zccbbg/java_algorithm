package sort;

public class SelectionSort {
    public static void selectionSort(float[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                float temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        float[] a = {10, 6, 7, 1, 2, 16, 18, 9};
        selectionSort(a);

        for (float num : a) {
            System.out.print(num + " ");
        }
    }
}
