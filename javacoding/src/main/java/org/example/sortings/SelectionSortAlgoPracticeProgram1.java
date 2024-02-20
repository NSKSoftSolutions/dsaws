package org.example.sortings;

public class SelectionSortAlgoPracticeProgram1 {
    public static void main(String[] args) {
        int[] arr = {40, 50, 10, 5, 60};
        int size = arr.length;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println("swaping the elements");
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
