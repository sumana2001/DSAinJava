package arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoUnsortedArrays {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int j = 0; j < b.length; j++) {
            set.add(b[j]);
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(findUnion(a, b));
        sc.close();
    }
}
