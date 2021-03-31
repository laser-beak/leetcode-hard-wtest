package ru.aincorp.leetcode.problems.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {

    @Test
    private void result_zero_when_array_nums_of_zero() {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        int[] num1 = {0, 0};
        int[] num2 = {0, 0};

        assertEquals(0.00000, medianOfTwoSortedArrays.findMedianSortedArrays(num1, num2));
    }

}