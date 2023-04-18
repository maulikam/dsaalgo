package org.example;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 45, 67, 34, -5, 86, 88, 5, 0, -3};
        int target = 51;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

        System.out.println("Min number in array :" + min(nums));

    }

    // search in the array: return the idnex if item found
    // or return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) return -1;
        for (int index = 0; index < arr.length; index++) {
            // check for element in array
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    // return the element if found the element
    // or return max int value
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0) return -1;
        for (int element : arr) {
            // check for element in array
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    // return the true if found the element
    // or return false
    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0) return false;
        for (int element : arr) {
            // check for element in array
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    // assume arr is not empty
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}