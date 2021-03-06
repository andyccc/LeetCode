
/*
Sort a linked list using insertion sort.

Sort in place without extra space

 */

package com.ccc;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        ListNode head = new ListNode(4);
        head.next = new ListNode(19);
        head.next.next = new ListNode(14);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(-3);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next = new ListNode(11);
        head.next.next.next.next.next.next.next.next.next = new ListNode(15);

        head = insertionSortList2(head);
    }

    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode node, cur = head.next;

        while (cur != null) {
            node = head;
            while (node != cur) {
                if (node.val <= cur.val) {
                    if (node.next.val <= cur.val) {
                        node = node.next;
                        if (node == cur) {
                            cur = node.next;
                            break;
                        }
                    } else {
                        ListNode cur_next = cur.next;
                        ListNode nod_next = node.next;
                        cur.next = node.next;
                        node.next = cur;
                        while (nod_next.next != cur) nod_next = nod_next.next;
                        nod_next.next = cur_next;
                        cur = cur_next;
                        break;
                    }
                } else {
                    ListNode cur_next = cur.next;
                    cur.next = node;
                    while (node.next != cur) node = node.next;
                    node.next = cur_next;
                    head = cur;
                    cur = cur_next;
                    break;
                }
            }
        }
        return head;
    }


    public static ListNode insertionSortList2(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode helper = new ListNode(0);
        ListNode cur = head, cur_next, pre = helper;

        while (cur != null) {
            cur_next = cur.next;
            while (pre.next != null && pre.next.val < cur.val) {
                pre = pre.next;
            }
            
            cur.next = pre.next;
            pre.next = cur;
            pre = helper;
            cur = cur_next;
        }

        return helper.next;
    }
}
