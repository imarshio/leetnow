## 每日一题

## 牛客

[me](https://www.nowcoder.com/users/635062304)

### 2024-07-04 大数加法

[大数加法](https://www.nowcoder.com/practice/11ae12e8c6fe48f883cad618c2e81475?tpId=196&tqId=37176&rp=1&ru=/exam/oj&qru=/exam/oj&sourceUrl=%2Fexam%2Foj%3Ftab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D196%26page%3D1&difficulty=undefined&judgeStatus=undefined&tags=&title=)

简单说下思路，因为知道题目是大数加法，所以很简单就能知道，只使用 `Integer` 或者 `Long`
肯定会出现越界的情况，所以不能简单的使用 `add`。

既然不能使用整体加法，那就只能从低位一个一个往高位加，该进位进位。

遵循这个思路，实现一下即可。

#### 亮点

- 使用了 `char` 类型，如果已知一个 `char` 为数字，那么 `valueOf(char) - 48 ` 就可以得到对应的数字。
- 时间复杂度为 O(n)
- 空间复杂度为 O(max(n,m) + 1)


#### 实现

```java
public String solve(String s, String t) {
    // write code here
    int sLength = s.length();
    int tLength = t.length();
    int maxLength = Math.max(sLength, tLength);
    int[] result = new int[maxLength + 1];
    int index = 0;
    int carry = 0;
    for (int i = maxLength; i > 0; i--) {
        int mid = carry;
        if (index < sLength) {
            mid += s.charAt(sLength - index - 1) - 48;
        }
        if (index < tLength) {
            mid += t.charAt(tLength - index - 1) - 48;
        }
        result[index++] = mid % 10;
        carry = mid >= 10 ? 1 : 0;
    }
    if (carry == 1) {
        result[index] = carry;
    }
    StringBuilder b = new StringBuilder();
    for (int i = maxLength; i >= 0; i--) {
        if (i == maxLength && result[i] == 0) {
            continue;
        }
        b.append(result[i]);
    }
    return b.toString();
}
```

### 2024-07-05 反转链表

简单说下思路，很明显的递归调用题目，先递归探底，确定新的头节点，然后逐层返回，顺便将指针反转，顺便记得将新的 尾节点的 `next` 置空。

期间只有在确定尾节点的多花了点时间，整体大概耗时30min，对于处在恢复期的我来说，还算一般。

#### 亮点

- 递归调用。
- 时间复杂度为 O(n)
- 空间复杂度为 O(1)


#### 实现

```java
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
```

## leetcode

## 剑指offer

