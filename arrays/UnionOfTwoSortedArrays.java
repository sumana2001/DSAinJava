package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfTwoSortedArrays {
    public static void addIfNotDuplicate(ArrayList<Integer> list, int val) {
        if (list.isEmpty() || list.get(list.size() - 1) != val) {
            list.add(val);
        }
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                addIfNotDuplicate(result, a[i]);
                i++;
            } else if (a[i] > b[j]) {
                addIfNotDuplicate(result, b[j]);
                j++;
            } else {
                addIfNotDuplicate(result, a[i]);
                i++;
                j++;
            }
        }
        while (i < a.length) {
            addIfNotDuplicate(result, a[i]);
            i++;
        }
        while (j < b.length) {
            addIfNotDuplicate(result, b[j]);
            j++;
        }
        return result;
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
