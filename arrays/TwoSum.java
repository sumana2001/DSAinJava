package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSumBrute(int[] arr, int n, int target){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]+arr[j]==target && i!=j){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] twoSumBetter(int[] arr, int n, int target){
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int rem=target-arr[i];
            if(mp.containsKey(rem)){
                int[] result=new int[2];
                result[0]=mp.get(rem);
                result[1]=i;
                return result;
            }
            mp.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }

    //if yes no only
    public static String twoSumBest(int[] arr, int n, int target){
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                return "YES";
            } else if(arr[left]+arr[right]>target){
                right--;
            } else {
                left++;
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result=twoSumBetter(arr, n, target);
        System.out.println(result[0]+" "+result[1]);
        sc.close();
    }
}
