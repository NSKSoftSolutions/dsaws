package org.example.bs;

public class BinarySearchPracticeProgram1 {
    public static void main(String[] args) {

        //we have sorted array we need to find the target element 80 from array 10 20 30 40 50 60 70 80 90 100
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int target = 180;
        int size = arr.length;

        int res = findNumber(arr, target, size);
        if (res >= 1) {
            System.out.println("Search is successfull, we found the number");
        } else {
            System.out.println("Search isn't successfull, the given number is not exist");
        }
    }

    private static int findNumber(int[] arr, int target, int size) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] <= target) {
                low = mid + 1;
            } else if (arr[mid] >= target) {
                high = mid - 1;
            }

        }

        return -1;
    }
}
