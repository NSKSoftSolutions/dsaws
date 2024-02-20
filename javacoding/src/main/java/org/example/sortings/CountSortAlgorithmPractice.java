package org.example.sortings;

public class CountSortAlgorithmPractice {
    public static void main(String[] args) {

        //int[] A -> 6 3 9 10 15 6 8 12 3 6
        int[] a = {6, 3, 9, 10, 15, 6, 8, 12, 3, 6};
        int MAX_VALUE = findingMaxValue(a);
        System.out.println("Max value->" + MAX_VALUE);
        int[] res = sortingELements(MAX_VALUE, a);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

    private static int[] sortingELements(int MAX_VALUE, int[] a) {
        int[] c = new int[MAX_VALUE + 1];

        for (int i = 0; i < c.length; i++) {
            c[i] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }
        int j = 0;
        int i = 0;
        while (i < (MAX_VALUE + 1)) {
            if (c[i] > 0) {
                a[j] = i;
                j++;
                c[i]--;

            } else {
                System.out.println(i + " Occurences are -->" + c[i]);
                i++;

            }
        }
        return a;
    }

    private static int findingMaxValue(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

}
