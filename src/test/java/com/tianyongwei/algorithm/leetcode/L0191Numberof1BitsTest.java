package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0191Numberof1BitsTest {

    @Test
    void hammingWeight() {
        assertEquals(1, new L0191Numberof1Bits().hammingWeight(1));
    }

    @Test
    void hammingWeight2() {
        assertEquals(0, new L0191Numberof1Bits().hammingWeight(0));
    }

    @Test
    void hammingWeight3() {
        assertEquals(2, new L0191Numberof1Bits().hammingWeight(3));
    }

    @Test
    void hammingWeight4() {
        assertEquals(3, new L0191Numberof1Bits().hammingWeight(7));
    }

    @Test
    void hammingWeight5() {
        assertEquals(3, new L0191Numberof1Bits().hammingWeight(11));
    }
}