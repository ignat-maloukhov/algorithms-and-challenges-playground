package demo.malouhov.twopointers;

import java.util.Arrays;

/*
https://www.techiedelight.com/ru/find-pair-with-given-sum-array/
https://medium.com/geekculture/intro-to-algorithms-two-pointers-technique-b37f962eab5
https://www.geeksforgeeks.org/two-pointers-technique/


 */

public class Exercise {

    public static void reverseArray(int[] input) {
        int left = 0;
        int right = input.length - 1;

        int temp;
        while (left < right) {
            temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] testArray1 = {1, 2, 3, 4};
        int[] testArray2 = {1, 2, 3, 4, 5};
        int[] testArray3 = {1, 1, 1, 2, 3};

        reverseArray(testArray1);
        System.out.println(Arrays.toString(testArray1));

        reverseArray(testArray2);
        System.out.println(Arrays.toString(testArray2));

        reverseArray(testArray3);
        System.out.println(Arrays.toString(testArray3));
    }


}
