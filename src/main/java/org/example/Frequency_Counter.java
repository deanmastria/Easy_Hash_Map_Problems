package org.example;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Counter {
    public static HashMap<Integer, Integer> countFrequency(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 8};
        HashMap<Integer, Integer> result = countFrequency(arr);
        System.out.println(result);
    }
    }

