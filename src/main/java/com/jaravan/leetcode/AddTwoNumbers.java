package com.jaravan.leetcode;

/**
 * Created by icer on 2017/12/6.
 */
public class AddTwoNumbers {
    /**
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     * <p>
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * <p>
     * Example
     * <p>
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     */

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode c3 = new ListNode(0);
        ListNode tempNode = c3;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }

            tempNode.next = new ListNode(sum % 10);
            tempNode = tempNode.next;
        }
        if (sum / 10 == 1) {
            tempNode.next = new ListNode(1);
        }
        return c3.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(6);
        ListNode a3 = new ListNode(6);
        a1.next = a2;
        a2.next = a3;
        ListNode listNode = addTwoNumbers(l1, a1);
        ListNode temp = listNode;
        temp = reverseNode(temp);
        StringBuilder sb=new StringBuilder();
        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }
        System.out.println(sb.toString());

    }


    /**
     * 单链表的逆序
     *
     * @param head
     * @return
     */
    public static ListNode reverseNode(ListNode head) {
        if (head == null) return null;

        ListNode preNode = null;
        ListNode curNode = head;
        ListNode nextNode = null;

        while (curNode != null) {
            nextNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }

        return preNode;


    }

}
