package com.sudip.code;

/*
108. Convert Sorted Array to Binary Search Tree
Easy

2112

196

Add to List

Share
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5
 */


public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if (len==0) return null;
        return construct(nums,0,len-1);
    }

    //Idea is to recursively find median (to maintain the height balance)
    private TreeNode construct(int[] nums, int left, int right){
        if (left>right) return null;
        int midPoint = left + (right-left)/2;
        TreeNode node = new TreeNode(nums[midPoint]);
        node.left=construct(nums,left,midPoint-1);
        node.right=construct(nums,midPoint+1,right);
        return node;
    }
}
