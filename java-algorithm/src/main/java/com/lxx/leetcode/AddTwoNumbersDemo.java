package com.lxx.leetcode;

import java.util.Arrays;

/**
 * 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 输入：l1 = [2,4,3], l2 = [5,6,4] 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 *
 * @Author lxx
 * @Date 2021/7/16
 */
public class AddTwoNumbersDemo {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode next = new ListNode(4);
        l1.next = next;
        next.next = new ListNode(3);


        ListNode l2 = new ListNode(5);
        ListNode next2 = new ListNode(6);
        l2.next = next2;
        next2.next = new ListNode(4);

        ListNode listNode = addTwoNumbers(l1, l2);
        int val = listNode.val;
        int val1 = listNode.next.val;
        int val2 = listNode.next.next.val;
        System.out.println(Arrays.toString(new int[]{val, val1, val2}));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tmp = dummy;
        int t = 0;
        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            t = a + b + t;
            tmp.next = new ListNode(t % 10);
            t /= 10;
            tmp = tmp.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (t > 0) {
            tmp.next = new ListNode(t);
        }
        return dummy.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
