package demo.malouhov.twopointers;


/*
11. Container With Most Water.

You are given an integer array height of length n.
There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
In this case, the max area of water (blue section) the container can contain is 49.

https://leetcode.com/problems/container-with-most-water/editorial/
 */
public class ContainerWithMostWater {

    public static void maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int volume = 0;

        int bestLeft = 1;
        int bestRight = height.length - 1;

        int tempVolume;
        int width;
        while (left < right) {
            width = right - left;
            tempVolume = Math.min(height[left], height[right]) * width;

            if (tempVolume > volume) {
                volume = tempVolume;
                bestLeft = left;
                bestRight = right;
            }

            if (height[left] <= height[right]) {
                left++;
            } else right--;
        }

        System.out.println("Biggest volume " + volume);
        System.out.println("Best positions of partition (from first): left=" + (bestLeft + 1) + ", right=" + (bestRight + 1));
    }


    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height1 = {1, 1};

        maxArea(height);
        maxArea(height1);

    }
}
