package arrays;

import java.util.Scanner;

public class SecondLargestNumberInArray {
    public static int secondLargestNumberInArray(int[] arr, int n) {
        int max = -1;
        int smax = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] < max) {
                smax = arr[i];
            }
        }
        return smax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(secondLargestNumberInArray(arr, n));
        sc.close();
    }
}
