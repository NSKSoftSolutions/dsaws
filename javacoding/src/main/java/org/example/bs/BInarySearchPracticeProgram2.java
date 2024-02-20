package org.example.bs;

public class BInarySearchPracticeProgram2 {
    public static void main(String[] args) {
        //we are having an array we want to the taget element 40 from the array 10,20,30,40
        int[] arr = {10, 20, 30, 40};
        int target = 40;
        int result = findTargetElement(arr, arr.length, target);
        if (result >= 1) {
            System.out.println("Search is Successfull, We Found the Target Element");
        } else {
            System.out.println("Search is not successfull, Target element is not available in the given array");
        }
    }


    private static int findTargetElement(int[] arr, int length, int target) {
        int low = 0;
        int high = arr.length-1 ;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] >= target) {
                high = mid - 1;
            } else if (arr[mid] <= target) {
                low = mid + 1;
            }
        }


        return -1;
    }
}
