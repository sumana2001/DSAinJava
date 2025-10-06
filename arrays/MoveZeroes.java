package arrays;

import java.util.Scanner;

import sort.PrintAnyArray;

public class MoveZeroes {
    public static void moveZeroes(int[] arr, int n) {
        int i = 0;
        while (i < n && arr[i] != 0) {
            i++;
        }
        int j = i + 1;
        while (j < n) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        PrintAnyArray.printAnyArrayStatic(arr);
        moveZeroes(arr, n);
        PrintAnyArray.printAnyArrayStatic(arr);
        sc.close();
    }
}
