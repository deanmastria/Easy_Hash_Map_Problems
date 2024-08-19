package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> wordMap = new HashMap<>();
        String[] words = str.split(" ");

        // Loop through the words and count frequencies
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        return wordMap;
    }

    public static void main(String[] args) {
        String str = "apex road straight narrow narrow road road apex";
        HashMap<String, Integer> result = countWords(str);
        System.out.println(result);
    }
}