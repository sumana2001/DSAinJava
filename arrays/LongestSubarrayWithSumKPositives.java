package arrays;

import java.util.*;

public class LongestSubarrayWithSumKPositives {
    public static int longestSubarrayBrute(int[] arr, int n, int k) {
        int msize = 0;
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                if(sum>k){
                    break;
                }
                sum += arr[j];
                if (sum == k) {
                    int size = j - i + 1;
                    msize = Math.max(size, msize);
                }
            }
        }
        return msize;
    }

    public static int longestSubarrayOptimized(int[] arr, int n, int k) {
        int i=0, j=0, msize=0, sum=0;
        while(j<n){
            sum+=arr[j];
            while(sum>k && i<=j){
                sum-=arr[i];
                i++;
            }
            if(sum==k){
                msize=Math.max(msize, j-i+1);
            }
            j++;
        }
        return msize;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestSubarrayBrute(arr, n, k));
        System.out.println(longestSubarrayOptimized(arr, n, k));
        sc.close();
    }
}
