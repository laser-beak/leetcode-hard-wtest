package ru.aincorp.leetcode.problems.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {

    @Test
    void findMedianSortedArrays() {

    }

    @Test
    void find_Median_Sorted_Arrays_When_Zero_Arrays() {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        int[] num1 = {0, 0};
        int[] num2 = {0, 0};

        assertEquals(0.00000, medianOfTwoSortedArrays.findMedianSortedArrays(num1, num2));
    }
}