package sort;

import java.util.Scanner;

public class RecursiveBubbleSort{
    static void recursiveBubbleSort(int[] arr,int n){
        if(n==1){
            return;
        }
        boolean swapped=false;
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
        }
        if(!swapped){
            return;
        }
        recursiveBubbleSort(arr, n-1);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        PrintAnyArray.printAnyArrayStatic(arr);
        recursiveBubbleSort(arr,n);
        PrintAnyArray.printAnyArrayStatic(arr);
        sc.close();
    }
}