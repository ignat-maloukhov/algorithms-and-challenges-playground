package demo.malouhov.removeElement;

import java.util.Arrays;

/*
27. Remove Element
Given an integer array nums and an integer val,
remove all occurrences of val in nums in-place.
The order of the elements may be changed.
Then return the number of elements in nums
which are not equal to val.

Consider the number of elements in nums
which are not equal to val be k, to get accepted,
you need to do the following things:

Change the array nums such that the first k elements
of nums contain the elements which are not equal to val.
The remaining elements of nums are not important
as well as the size of nums.

Return k.
 */
public class SolutionStream {

    public static int removeElement(int[] nums, int val) {
        int[] temp = Arrays.stream(nums).filter(e -> e != val).toArray();
        System.arraycopy(temp, 0, nums, 0, temp.length);
        return temp.length;
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 2, 2, 3, 0, 4, 2};
        removeElement(input, 2);
        System.out.println(Arrays.toString(input));

    }
}
