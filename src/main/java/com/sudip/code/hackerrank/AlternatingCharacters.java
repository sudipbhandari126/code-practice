package com.sudip.code.hackerrank;
/*
You are given a string containing characters  and  only. Your task is to change it into a string such that there are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.

Your task is to find the minimum number of required deletions.

For example, given the string , remove an  at positions  and  to make  in  deletions.

Function Description

Complete the alternatingCharacters function in the editor below. It must return an integer representing the minimum number of deletions to make the alternating string.

alternatingCharacters has the following parameter(s):

s: a string
Input Format

The first line contains an integer , the number of queries.
The next  lines each contain a string .

Constraints

Each string  will consist only of characters  and
Output Format

For each query, print the minimum number of deletions required on a new line.

Sample Input

5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB
Sample Output

3
4
0
0
4
Explanation

The characters marked red are the ones that can be deleted so that the string doesn't have matching consecutive characters.

image


 */
public class AlternatingCharacters {

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAAA"));
    }

    static int alternatingCharacters(String s) {
        s=s.toLowerCase();
        int deletions = 0;
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i=0; i< len-1 ;i++){
            if (chars[i]==chars[i+1]) deletions++;
        }
        return deletions;
    }

}
