package org.example.bs;

public class BinarySearchPractice {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int i;
        int targetElement = 90;
        int result = findElement(arr, arr.length, targetElement);
        if (result >= 1) {
            System.out.println("Found the Element");
        } else {
            System.out.println("Element not found");
        }

    }

    private static int findElement(int[] arr, int length, int targetElement) {
        int low = 0, high = length - 1, mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == targetElement) {
                return mid;
            } else if (arr[mid] > targetElement) {
                high = mid - 1;
            } else if (arr[mid] < targetElement) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
