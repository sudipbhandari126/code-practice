package com.sudip.code;
/*
206. Reverse Linked List
Easy

4051

84

Add to List

Share
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode temp=null;


        while (head!=null){

            temp=head.next;

            head.next=prev;

            prev=head;

            head=temp;
            //print("head",head);


        }
        return prev;

    }
}
