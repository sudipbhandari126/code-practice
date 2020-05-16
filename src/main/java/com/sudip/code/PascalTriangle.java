package com.sudip.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
public class PascalTriangle {
    public static void main(String[] args) {
        generate(5).forEach(System.out::println);
    }

    private static List<List<Integer>> generate(int numRows) {
        if (numRows==0) return new ArrayList<List<Integer>>();
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> row = Arrays.asList(1);
        ans.add(row);
        for (int index=1;index<=numRows-1;index++){

            List<Integer> tempRow = new ArrayList<>();

            tempRow.add(1);
            for (int i=0;i<row.size()-1;i++){
                tempRow.add(row.get(i)+row.get(i+1));
            }
            tempRow.add(1);


            row=tempRow;
            ans.add(row);

        }
        return ans;
    }}
