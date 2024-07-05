package com.marshio.leetnow.huawei;

/**
 * @author marshio
 * @desc ...
 * @create 2024/7/5 10:19
 */
public class Test002 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.println(new Test002().ReverseList(head));
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * <a href="https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=295&tqId=23286&ru=/exam/oj&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Foj%3Fpage%3D1%26tab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D295%26fromPut%3Dpc_kol_aaaxiu">反转链表</a>
     * 输入：{1,2,3}
     *
     * @param head ListNode类 长度大于等于0
     * @return ListNode类
     */
    public ListNode ReverseList(ListNode head) {
        // 递归 recursion
        if (null == head) {
            return null;
        }
        ListNode next = head.next;
        if (null == next) {
            return head;
        }
        return recursionList(head, next);
    }

    private ListNode recursionList(ListNode current, ListNode next) {
        ListNode head;
        if (null != next.next) {
            head = recursionList(next, next.next);
        } else {
            head = next;
        }
        next.next = current;
        current.next = null;
        return head;
    }
}
