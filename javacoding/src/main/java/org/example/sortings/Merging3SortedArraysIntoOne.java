package org.example.sortings;

public class Merging3SortedArraysIntoOne {
    public static void main(String[] args) {
        int[] a1 = {2, 5, 8, 11};
        int[] a2 = {1, 3, 7, 10};
        int[] a3 = {4, 6, 8, 12};

        int n = a1.length;
        int s = a2.length;
        int k = a3.length;


        int[] c = new int[n + s + k];

        int[] res = merge3Into1(a1, a2, a3, n, s, k, c);
        for (int sajjad = 0; sajjad < res.length; sajjad++) {
            System.out.print(res[sajjad] + " ");
        }

    }

    private static int[] merge3Into1(int[] a1, int[] a2, int[] a3, int n, int s, int k, int[] c) {

        int i = 0;
        int j = 0;
        int l = 0;
        int sk = 0;
        while (i < n && j < s && l < k) {
            if (a1[i] < a2[j] && a1[i] < a3[l]) {
                c[sk++] = a1[i++];
            } else if (a2[j] < a1[i] && a2[j] < a3[l]) {
                c[sk++] = a2[j++];
            } else {
                c[sk++] = a3[l++];
            }

        }
        for (; i < n; i++) {
            c[sk] = a1[i];
            sk++;
        }
        for (; j < s; j++) {
            c[sk] = a2[j];
            sk++;
        }
        for (; l < k; l++) {
            c[sk] = a3[l];
            sk++;
        }
        return c;
    }

}
