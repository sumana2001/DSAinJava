package arrays;

import java.util.Scanner;

import sort.PrintAnyArray;

public class sortColours {
    public static void sortColours1(int[] arr,int n){
        int red=0,blue=0,white=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                red++;
            }
            else if(arr[i]==1){
                white++;
            } else {
                blue++;
            }
        }
        for(int i=0;i<red;i++){
            arr[i]=0;
        }
        for(int i=0;i<white;i++){
            arr[i+red]=1;
        }
        for(int i=0;i<blue;i++){
            arr[i+red+white]=2;
        }
    }
    public static void sortColours2(int[] arr, int n){
        int low=0,mid=0,high=n-1;
        for(int i=0;i<n;i++){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            } else if(arr[mid]==1){
                mid++;
            } else {
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
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
        sortColours1(arr, n);
        PrintAnyArray.printAnyArrayStatic(arr);
        sortColours2(arr, n);
        PrintAnyArray.printAnyArrayStatic(arr);
        sc.close();
    }
}
