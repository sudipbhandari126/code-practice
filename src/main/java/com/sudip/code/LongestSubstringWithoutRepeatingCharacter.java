package com.sudip.code;

/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {

        char[] chars = s.toCharArray();
        if (chars.length==1) return 1;
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int len=0;
        for (int i=0;i<chars.length;i++){
            for (int j=i;j<chars.length;j++){
                if (charSet.contains(chars[j])){
                    maxLength=Math.max(maxLength,charSet.size());
                    charSet.clear();
                    len=0;
                    break;
                }else{
                    charSet.add(chars[j]);
                    len++;
                }
            }


        }
        return maxLength;
    }
}
