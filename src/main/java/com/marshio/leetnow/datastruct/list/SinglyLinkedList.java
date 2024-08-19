package com.marshio.leetnow.datastruct.list;


/**
 * @author marshio
 * @desc ...
 * @create 2024/8/16 14:55
 */
public class SinglyLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.println(new SinglyLinkedList().reverseList(head));
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 反转链表
     *
     * @param head 头节点
     * @return 反转后的链表
     */
    public ListNode reverseList(ListNode head) {
        return recursionList(head);
    }

    /**
     * 递归链表
     *
     * @param node 当前节点
     * @return 新的头节点
     */
    public ListNode recursionList(ListNode node) {
        ListNode next = node.next;
        if (null == next) {
            return node;
        }
        ListNode tmp = recursionList(next);
        next.next = node;
        node.next = null;
        return tmp;
    }
}
