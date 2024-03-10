package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0122BestTimetoBuyandSellStockIITest {

    @Test
    void maxProfit() {
        assertEquals(7, new L0122BestTimetoBuyandSellStockII().maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void maxProfit2() {
        assertEquals(4, new L0122BestTimetoBuyandSellStockII().maxProfit(new int[]{1,2,3,4,5}));
    }
}