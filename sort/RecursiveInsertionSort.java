package sort;

import java.util.Scanner;

public class RecursiveInsertionSort {
    public static void recursiveInsertionSort(int[] arr, int n) {
        if (n <= 0) {
            return;
        }
        recursiveInsertionSort(arr, n - 1);
        int j = n;
        while (j > 0 && arr[j] < arr[j - 1]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        PrintAnyArray.printAnyArrayStatic(arr);
        recursiveInsertionSort(arr, n - 1);
        PrintAnyArray.printAnyArrayStatic(arr);
        sc.close();
    }
}
