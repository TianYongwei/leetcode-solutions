package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class L0001TwoSumTest {

    @Test
    void solution() {

        int[] sums = { -3, 4, 3, 90 };
        int[] result = new L0001TwoSum().solution1(sums, 93);
        assertArrayEquals(new int[]{2, 3}, result);
    }

    @Test
    void solution2() {
        int[] sums = { -3, 4, 3, 90 };
        int[] result = new L0001TwoSum().solution1(sums, 94);
        assertArrayEquals(new int[]{1, 3}, result);
    }
}