package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSortedAndRotatedArray {
    public static boolean checkOptimized(int[] nums){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        if(count>1)
            return false;
        return true;
    }

    public static boolean check(int[] nums) {
        int[] numsSorted=Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsSorted);
        int x=0;
        while(x<nums.length){
            boolean equal=true;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=numsSorted[(i+x)%nums.length]){
                    equal=false;
                    break;
                }
            }
            if(equal)
                return true;
            x++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(check(arr));
        System.out.println(checkOptimized(arr));
        sc.close();
    }
}
