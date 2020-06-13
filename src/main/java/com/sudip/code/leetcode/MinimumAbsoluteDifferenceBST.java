package com.sudip.code.leetcode;
/*
530. Minimum Absolute Difference in BST
Easy

763

62

Add to List

Share
Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

Example:

Input:

   1
    \
     3
    /
   2

Output:
1

Explanation:
The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).


Note:

There are at least two nodes in this BST.
This question is the same as 783: https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 */
public class MinimumAbsoluteDifferenceBST {


    int minDiff = Integer.MAX_VALUE;
    Integer prevValue=null;

    public int getMinimumDifference(TreeNode root) {
        return traverse(root);
    }

    private int traverse (TreeNode node){
        if (node!=null){
            traverse(node.left);
            if (prevValue!=null){
                int diff = Math.abs(prevValue-node.val);
                //System.out.print(diff);
                minDiff = Math.min(minDiff,diff);
            }
            prevValue = node.val;
            traverse(node.right);
        }
        return minDiff;
    }

}
