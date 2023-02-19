package org.example.LinkedList;

import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
//        [1,2,3,4,5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(head);
//        ListNode result = reverseList(head);
//        printList(result);
        ListNode result1 = reverseRecursive(head);
        printList(result1);
    }

    private static void printList(ListNode head) {
        while(head!=null){
            System.out.print(head.val +" -> ");
            head = head.next;
        }
        System.out.println();
    }

    private static ListNode reverseList(ListNode head) {// 1->2->3->4->5
        if(head ==null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = head.next;

        while(curr.next != null){
            curr.next = prev;
            prev = curr;
            curr = nxt;
            nxt = nxt.next;
        }
        curr.next = prev;
        return curr;
    }

    private static ListNode reverseRecursive(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}