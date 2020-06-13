package com.sudip.code.leetcode;
/*
101. Symmetric Tree
Easy

3692

87

Add to List

Share
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3


But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3


Follow up: Solve it both recursively and iteratively.
 */
public class SymmetricBinaryTree {


    public boolean isSymmetric(TreeNode root) {
        //recursion
        return areSame(root, root);
    }


    boolean areSame(TreeNode t1, TreeNode t2){

        if (t1==null && t2==null) return true;
        if (t1==null ^ t2==null) return false;

        return (t1.val==t2.val) && areSame(t1.left,t2.right) && areSame(t1.right,t2.left);

    }


    //this works only if the tree is perfectly balanced and complete
    boolean areSame(TreeNode root){
        if (root==null) return true;
        if (root.left==null && root.right==null) return true;
        if (root.left==null ^ root.right==null) return false;
        if (root.left!=null && root.right!=null){
            return (root.left.val==root.right.val) && areSame(root.left) && areSame(root.right);
        }
        return false;
    }

}
