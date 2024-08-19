package org.example;

import java.util.HashMap;

public class TwoSum {
    public static boolean hasTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array and check for complement
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return true;
            }
            map.put(arr[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        boolean result = hasTwoSum(arr, target);
        System.out.println(result);  // Output: true
    }
}