package com.sudip.code;
/*
9. Palindrome Number
Easy

2165

1514

Add to List

Share
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?
 */
public class PalindromeNumberWithHalfReversal {

    public boolean isPalindrome(int x) {
        if (x==0) return true;

        if (x<0 || x%10==0) return false;


        int rev=0;

        while (x>rev){
            int rem = x%10;
            rev=rev*10+rem;
            x=x/10;
        }

        if (x==rev || x==rev/10) return true;
        return false;

    }

}
