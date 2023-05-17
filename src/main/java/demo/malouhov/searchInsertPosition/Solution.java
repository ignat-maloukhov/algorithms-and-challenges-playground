package demo.malouhov.searchInsertPosition;

/*
35. Given a sorted array of distinct integers and a target value,
return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
 */

import java.util.Arrays;

public class Solution {

    public static int searchInsert(int[] nums, int target) {
        int temp = Arrays.binarySearch(nums, target);
        return temp < 0 ? (-1) * temp - 1 : temp;
    }

}
