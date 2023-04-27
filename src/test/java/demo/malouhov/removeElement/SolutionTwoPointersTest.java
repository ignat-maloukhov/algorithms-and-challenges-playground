package demo.malouhov.removeElement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static demo.malouhov.removeElement.SolutionStream.removeElement;

class SolutionTwoPointersTest {

    @Test
    public void removeElementTest() {
        int val = 2;
        int[] input = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int expectedResult = 5;
        int[] expectedArray = new int[]{0, 1, 3, 0, 4, 0, 4, 2};

        int result = removeElement(input, val);

        Assertions.assertEquals(expectedResult, result);
        Assertions.assertArrayEquals(expectedArray, input);

    }
}