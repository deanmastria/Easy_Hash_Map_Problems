package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TwoSumTest {

    @Test
    public void testHasTwoSum() {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        boolean result = TwoSum.hasTwoSum(arr, target);
        assertTrue(result);
    }

    @Test
    public void testNoTwoSum() {
        int[] arr = {2, 7, 11, 15};
        int target = 10;
        boolean result = TwoSum.hasTwoSum(arr, target);
        assertFalse(result);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int target = 10;
        boolean result = TwoSum.hasTwoSum(arr, target);
        assertFalse(result);
    }
}