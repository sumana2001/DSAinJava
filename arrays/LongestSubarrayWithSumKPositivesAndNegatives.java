package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubarrayWithSumKPositivesAndNegatives {
    public static int longestSubarray(int[] arr, int n, int k){
        int msize=0,sum=0;
        Map<Integer,Integer> prefixSum=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                msize=Math.max(msize,i+1);
            }
            int rem=sum-k;
            if(prefixSum.containsKey(rem)){
                int len=i-prefixSum.get(rem);
                msize=Math.max(msize, len);
            }
            if(!prefixSum.containsKey(sum)){
                prefixSum.put(sum, i);
            }
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
        System.out.println(longestSubarray(arr, n, k));
        sc.close();
    }
}
