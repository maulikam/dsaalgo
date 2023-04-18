package org.example;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 12},
                {10, 11, -8}
        };

        int target = 12;
        System.out.println(searchIn2DArray(arr, target));

        int ans[] = searchIn2DArrayIndex(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    private static int max(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    private static int min(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    private static int[] searchIn2DArrayIndex(int[][] arr, int target) {
        for(int row=0; row<arr.length; row++) {
            for (int col=0; col<arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    private static boolean searchIn2DArray(int[][] arr, int target) {
        for(int row=0; row<arr.length; row++) {
            for (int col=0; col<arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
