package org.example.sortings;

public class MergingTwoArraysIntoSingleArray {
    public static void main(String[] args) {

        //we have 2 sorted array's we need to merge them in to 1 in ascending order

        int[] a = {2, 4, 6};
        int[] b = {1, 3, 5, 7};
        int m = a.length;
        int n = b.length;

        int[] arr = mergetwoArrays(a, b, m, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] mergetwoArrays(int[] a, int[] b, int m, int n) {

        int mn = m + n;
        int[] c = new int[mn];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        for (; i < m; i++) {
            c[k] = a[i];
            k++;
        }
        for (; j < n; j++) {
            c[k] = b[j];
            k++;
        }
        return c;
    }
}
