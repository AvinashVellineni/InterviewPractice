package com.problems.twopointer.easy;

import com.problems.models.ListNode;

public class PalindromeLinkedList {

    public static void main(String[] args){
        ListNode l4 = new ListNode(1);
        ListNode l3 = new ListNode(2,l4);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        System.out.println(isPalindrome(l1));
    }

    public static boolean isPalindrome(ListNode head) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (head!=null){
            sb1.append(head.val);
            sb2.append(head.val);
            head = head.next;
        }
        sb2.reverse();
        return sb1.toString().equals(sb2.toString());
    }
}
