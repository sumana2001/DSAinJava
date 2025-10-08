package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static int majorityElement(int[] arr, int n){
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int value=mp.getOrDefault(arr[i], 0);
            mp.put(arr[i], value+1);
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return 0;
    }
    public static int majorityElementSpaceOptimized(int[] arr, int n){
        int count=1,element=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==element){
                count++;
            } else {
                if(count==0){
                    element=arr[i];
                    count++;
                } else {
                    count--;
                }
            }
        }
        return element;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr, n));
        System.out.println(majorityElementSpaceOptimized(arr, n));
        sc.close();
    }
}
