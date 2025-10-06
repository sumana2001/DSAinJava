package arrays;

import java.util.Scanner;

import sort.PrintAnyArray;

public class LeftRotate {
    public static void leftRotateBrute(int[] arr, int n, int k) {
        k %= n;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + k) % n];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotateOptimized(int[] arr, int n, int k) {
        k %= n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // PrintAnyArray.printAnyArrayStatic(arr);
        // leftRotateBrute(arr,n,k);
        PrintAnyArray.printAnyArrayStatic(arr);
        leftRotateOptimized(arr, n, k);
        PrintAnyArray.printAnyArrayStatic(arr);
        sc.close();
    }
}
