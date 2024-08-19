package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;

public class WordCountTest {

    @Test
    public void testCountWords() {
        String str = "apex road straight narrow narrow road road apex";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("apex", 2);
        expected.put("road", 3);
        expected.put("straight", 1);
        expected.put("narrow", 2);

        HashMap<String, Integer> result = WordCount.countWords(str);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyString() {
        String str = " ";
        HashMap<String, Integer> expected = new HashMap<>();

        HashMap<String, Integer> result = WordCount.countWords(str);
        assertEquals(expected, result);
    }
}