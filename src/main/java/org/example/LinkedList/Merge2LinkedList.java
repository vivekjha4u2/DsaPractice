package org.example.LinkedList;

public class Merge2LinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(4);

        ListNode r = mergeTwoLists(head, head1);
        printList(r);
    }

    private static void printList(ListNode head) {
        while(head!=null){
            System.out.print(head.val +" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;


        }

        while(list1 != null){
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }

        while(list2 != null){
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }
        return result.next;
    }
}
