package com.sudip.code;
/*
19. Remove Nth Node From End of List
Medium

2976

220

Add to List

Share
Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?
 */
public class RemoveNthNodeFromLinkedList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slowHead = head;
        ListNode fastHead= head;

        for (int i=0;i<n;i++){
            if (fastHead==null) return null;
            fastHead=fastHead.next;
        }
        if (fastHead==null) return head.next;



        while (fastHead.next!=null){
            fastHead=fastHead.next;
            slowHead=slowHead.next;
        }
        //System.out.print("fast="+fastHead.val);
        //System.out.print("slow="+slowHead.val);
        slowHead.next=slowHead.next.next;
        return head;


    }

}
