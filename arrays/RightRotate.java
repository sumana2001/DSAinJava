package arrays;

import java.util.Scanner;

import sort.PrintAnyArray;

public class RightRotate {
    public static void rightRotateBrute(int[] arr, int n,int k){
        k%=n;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[(i+k)%n]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=result[i];
        }
    }

    public static void rightRotateOptimized(int[] arr, int n, int k){
        k%=n;
        LeftRotate.reverse(arr,0,n-1);
        LeftRotate.reverse(arr, 0, k-1);
        LeftRotate.reverse(arr, k, n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // PrintAnyArray.printAnyArrayStatic(arr);
        // rightRotateBrute(arr,n,k);
        PrintAnyArray.printAnyArrayStatic(arr);
        rightRotateOptimized(arr,n,k);
        PrintAnyArray.printAnyArrayStatic(arr);
        sc.close();
    }
}
