package sort;

import java.util.Scanner;

public class SelectionSort {
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int mini=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }

    static void printArray(int[] arr){
        System.out.println(" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        PrintAnyArray print=new PrintAnyArray();
        print.printAnyArray(arr);
        selectionSort(arr);
        print.printAnyArray(arr);
        sc.close();
    }
}