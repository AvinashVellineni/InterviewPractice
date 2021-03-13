package com.problems.models;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x){
        this.val=x;
        next=null;
    }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
