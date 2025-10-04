package arrays;

import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[j]){
                j++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(removeDuplicates(arr));
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
