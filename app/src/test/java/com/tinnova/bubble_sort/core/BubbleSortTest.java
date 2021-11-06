package com.tinnova.bubble_sort.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {
    @Test
    void order_shouldReturnOrderedVector() {
        Integer[] vector = new Integer[]{5, 3, 2, 4, 7, 1, 0, 6};
        Integer[] expect = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7};

        var result = BubbleSort.order(vector);

        Assertions.assertArrayEquals(expect, result);
    }

    @Test
    void order_shouldReturnOrderedList() {
        List<Integer> vector = Arrays.asList(5, 3, 2, 4, 7, 1, 0, 6);
        List<Integer> expect = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7);

        var result = BubbleSort.order(vector);

        Assertions.assertEquals(expect, result);
    }
}
