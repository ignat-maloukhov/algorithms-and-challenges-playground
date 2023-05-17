package demo.malouhov.indexOfOccurrence;

/*
Given two strings needle and haystack, return the index
of the first occurrence of needle in haystack,
or -1 if needle is not part of haystack.
 */

public class SolutionStringAPI {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
