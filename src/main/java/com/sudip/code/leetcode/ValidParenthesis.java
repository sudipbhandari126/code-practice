package com.sudip.code.leetcode;

import java.util.Stack;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */
public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (isOpening(c)){
                stack.push(c);
            }else{
                if (stack.isEmpty()) return false;
                char popped = stack.pop();
                if (!isAPair(popped,c)) return false;
            }
        }
        return stack.isEmpty();

    }

    public boolean isAPair(char c, char d){
        if (c=='(' && d==')') return true;
        if (c=='{' && d=='}') return true;
        if (c=='[' && d==']') return true;
        return false;
    }

    public boolean isOpening(char c){
        return (c=='(' || c=='{' || c=='[');
    }

   
}
