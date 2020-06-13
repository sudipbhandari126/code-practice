package com.sudip.code.leetcode;
import java.util.*;


/*
66. Plus One
Easy

1376

2218

Add to List

Share
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */


class PlusOneArrayForm {
    public static void main(String[] args) {
        int[] array = {1, 2, 9};
        for (int i : plusOne(array)) {
            System.out.print(i);
        }
    }


    public static int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<>();

        int carry=1;
        for (int i=digits.length-1;i>=0;i--){
            int sum = carry+digits[i];
            if (sum>9){
                stack.push(sum%10);
                carry=1;
            }else{
                stack.push(sum);
                carry=0;
            }
        }
        if (carry==1) stack.push(1);
        int[] ans = new int[stack.size()];
        int i=0;
        while (!stack.isEmpty()){
            ans[i]=stack.pop();
            i++;
        }
        return ans;
    }


    /*
    Fast and simple implementation (do just the necessary work and eliminate work if possible)
     */
    public int[] plusOneFast(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){
            if (digits[i]<9) {
                digits[i]++;
                return digits;
            }
            else digits[i]=0;
        }
        int[] newarr = new int[digits.length+1];
        newarr[0]=1;
        return newarr;
    }
}
