package org.example.sortings;

public class InsertionSortAlgoPrac {
    public static void main(String[] args) {
        int[] arr = {50, 40, 20, 30};
        int temp;
        int i = 1;
        int j = 0;
        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = temp;
        }
    }
}
