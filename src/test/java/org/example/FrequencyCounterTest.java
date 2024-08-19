package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;

public class FrequencyCounterTest {

    @Test
    public void testFrequencyCounter() {
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 8};
        HashMap<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 1);
        expected.put(4, 2);
        expected.put(5, 2);
        expected.put(6, 1);
        expected.put(7, 1);
        expected.put(8, 2);

        HashMap<Integer, Integer> actual = Frequency_Counter.countFrequency(arr);
        assertEquals(expected, actual);
    }

}
