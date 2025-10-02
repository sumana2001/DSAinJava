package sort;

import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        PrintAnyArray.printAnyArrayStatic(arr);
        insertionSort(arr);
        PrintAnyArray.printAnyArrayStatic(arr);
        sc.close();
    }
}
