package org.example.sortings;

public class SortingAnArrayUsingMergeSort {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 3, 5, 7};
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;

        int[] result = mergeSortBaby(mid, low, high, arr);
        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + " ");
        }

    }

    private static int[] mergeSortBaby(int mid, int low, int high, int[] arr) {

        int i = 0;
        int j = mid + 1;
        int k = i;

        int[] c = new int[high + 1];

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                c[k++] = arr[i++];
            } else {
                c[k++] = arr[j++];
            }
        }
        for (; i <= mid; i++) {
            c[k++] = arr[i];
        }
        for (; j <= high; j++) {
            c[k++] = arr[j];
        }
        return c;

    }
}
