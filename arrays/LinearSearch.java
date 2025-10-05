package arrays;

import java.util.Scanner;

import sort.PrintAnyArray;

public class LinearSearch {
    public static int search(int arr[], int n, int x) {
        for (int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(search(arr,n,x));
        sc.close();
    }
}
