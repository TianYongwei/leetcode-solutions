package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0108ConvertSortedArraytoBinarySearchTreeTest {

    @Test
    void sortedArrayToBST() {
        assertEquals(TreeNode.builder().val(1)
                        .build()
                , new L0108ConvertSortedArraytoBinarySearchTree().sortedArrayToBST(new int[]{1}));
    }
    @Test
    void sortedArrayToBST2() {
        assertEquals(TreeNode.builder().val(2)
                        .left(new TreeNode(1))
                        .right(new TreeNode(3))
                        .build()
                , new L0108ConvertSortedArraytoBinarySearchTree().sortedArrayToBST(new int[]{1,2,3}));
    }

    @Test
    void sortedArrayToBST3() {
        assertEquals(TreeNode.builder().val(1)
                        .right(new TreeNode(2))
                        .build()
                , new L0108ConvertSortedArraytoBinarySearchTree().sortedArrayToBST(new int[]{1,2}));
    }

}