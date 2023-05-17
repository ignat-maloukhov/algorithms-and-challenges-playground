package demo.malouhov.indexOfOccurrence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionStringAPITest {

    @Test
    public void strStr() {
        String needle = "sad";
        String haystack = "sadbutsad";
        int expected = 0;

        int actual = SolutionStringAPI.strStr(haystack, needle);

        Assertions.assertEquals(expected, actual);

    }
}