package com.sudip.code;
/*
104. Maximum Depth of Binary Tree
Easy

2250

69

Add to List

Share
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        return depthRecursion(root);
    }


    int depthRecursion(TreeNode root){
        if (root==null) return 0;
        return 1+ Math.max(depthRecursion(root.left),depthRecursion(root.right));
    }
}
