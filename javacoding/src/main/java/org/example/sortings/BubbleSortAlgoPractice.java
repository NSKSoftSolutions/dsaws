package org.example.sortings;

public class BubbleSortAlgoPractice {
    public static void main(String[] args) {
        int[] arr = {50, 40, 20, 30};
        int result = bubblesort(arr);
        if (result == -1) {
            System.out.println("Array is already sorted");
        }
    }

    private static int bubblesort(int[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                return -1;
            }
        }

        return flag;
    }
}
