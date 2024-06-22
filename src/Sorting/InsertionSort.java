package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{20, 40, 30, 10, 50, 90, 100, 80, 60, 70};
        for (int i = 1; i < a.length; i++) {
            int elem = a[i];
            int j = i - 1;
//             where should i put th element in sorted part
            while (j >= 0 && a[j] > elem) {
                a[j + 1] = a[j];
                j -= 1;
            }
            a[j + 1] = elem;
        }
        System.out.println(Arrays.toString(a));
    }
}
