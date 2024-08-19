package com.marshio.leetnow.datastruct.list;


/**
 * @author marshio
 * @desc ...
 * @create 2024/8/16 14:55
 */
public class DoublyLinkedList {

    public static void main(String[] args) {

    }

    public static class ListNode {
        int val;
        ListNode pre = null;
        ListNode next = null;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }
    }
}
