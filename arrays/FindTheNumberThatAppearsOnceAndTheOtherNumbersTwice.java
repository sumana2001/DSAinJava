package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindTheNumberThatAppearsOnceAndTheOtherNumbersTwice {
    public static int singleNumberBrute(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int singleNumberBetter(int[] arr, int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mp.getOrDefault(arr[i], 0);
            mp.put(arr[i], value + 1);
        }
        // for(Map.Entry<Integer,Integer> it:mp.entrySet()){
        // if(it.getValue()==1){
        // return it.getKey();
        // }
        // }

        // easier:
        for (int i : arr) {
            if (mp.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int singleNumberOptimal(int[] arr, int n) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNumberBrute(arr, n));
        System.out.println(singleNumberBetter(arr, n));
        System.out.println(singleNumberOptimal(arr, n));
        sc.close();
    }
}