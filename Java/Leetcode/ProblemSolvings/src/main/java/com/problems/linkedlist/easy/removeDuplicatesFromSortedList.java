package com.problems.linkedlist.easy;

import com.problems.linkedlist.model.ListNode;

public class removeDuplicatesFromSortedList {
    public static void main(String[] args){
        ListNode head = new ListNode(1,new ListNode(1,new ListNode(2,null)));
        ListNode result = deleteDuplicates(head);
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
