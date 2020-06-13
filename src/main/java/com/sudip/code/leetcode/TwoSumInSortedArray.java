package com.sudip.code.leetcode;
/*
167. Two Sum II - Input array is sorted
Easy

1487

573

Add to List

Share
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSumInSortedArray {

    public int[] twoSum(int[] numbers, int target) {

        int len = numbers.length;
        int index1,index2;
        index1=index2=0;

        for (int i=0,j=len-1; i<=j; ){
            int sum= numbers[i]+numbers[j];

            if (sum==target){
                index1=i+1;
                index2=j+1;
                break;
            }
            if (sum>target){
                j--;
                continue;
            }

            if (sum<target){
                i++;
                continue;
            }



        }
        return new int[]{index1,index2};
    }

}
