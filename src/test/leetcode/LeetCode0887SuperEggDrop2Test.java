package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0887SuperEggDrop2Test {

    LeetCode0887SuperEggDrop2 superEggDrop
            = new LeetCode0887SuperEggDrop2();

    @Test
    void testSuperEggDrop() {
        assertEquals(3, superEggDrop.superEggDrop(2, 6));
        assertEquals(4, superEggDrop.superEggDrop(3, 14));
        assertEquals(1, superEggDrop.superEggDrop(2, 1));
        assertEquals(19, superEggDrop.superEggDrop(4, 5000));
        assertEquals(14, superEggDrop.superEggDrop(8, 10000));
    }
}