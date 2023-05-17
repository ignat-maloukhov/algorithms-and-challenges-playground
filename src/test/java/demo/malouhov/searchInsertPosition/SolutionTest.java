package demo.malouhov.searchInsertPosition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static demo.malouhov.searchInsertPosition.Solution.searchInsert;

class SolutionTest {

    @Test
    void searchInsertTest1() {
        int[] input = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;

        int actual = searchInsert(input, target);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void searchInsertTest2() {
        int[] input = {1, 3, 5, 6};
        int target = 2;
        int expected = 1;

        int actual = searchInsert(input, target);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void searchInsertTest3() {
        int[] input = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;

        int actual = searchInsert(input, target);
        Assertions.assertEquals(expected, actual);
    }
}