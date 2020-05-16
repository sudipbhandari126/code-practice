package com.sudip.code;

/*
234. Palindrome Linked List
Easy

2795

337

Add to List

Share
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?
 */

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head==null) return true;
        ListNode original = duplicate(head);
        ListNode reversed = reverse(head);

        System.out.println("original");
        print(original);

        System.out.println();

        System.out.println("reversed");
        print(reversed);

        while (original!=null){
            if (original.val!=reversed.val) return false;
            original=original.next;
            reversed=reversed.next;
        }
        return true;


    }

    private ListNode duplicate(ListNode node){
        ListNode duplicate = new ListNode(node.val);
        ListNode duplicateHead = duplicate;
        node=node.next;
        while (node!=null){
            duplicate.next=new ListNode(node.val);
            duplicate=duplicate.next;
            node=node.next;
        }
        return duplicateHead;
    }

    private ListNode reverse(ListNode node){
        ListNode prev,temp;
        prev=temp=null;

        while (node!=null){
            temp = node.next;
            node.next=prev;
            prev=node;
            node=temp;
        }
        return prev;
    }

    private void print(ListNode node){
        while (node!=null){
            System.out.print(node.val);
            node=node.next;
        }
    }



    //We can also do it in place..
    //reverse the first half and compare node by node
    public boolean isPalindromeConstantSpace(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;

        while (slow!=null){
            if (slow.val!=fast.val) return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }


}
