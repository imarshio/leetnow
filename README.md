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

### 2024-07-08 字符串最后一个单词的长度

简单说下思路，很简单的一道题，主要考察Java基础知识的应用。

[字符串最后一个单词的长度](https://www.nowcoder.com/practice/8c949ea5f36f422594b306a2300315da?tpId=37&tqId=21224&rp=1&ru=/exam/oj/ta&qru=/exam/oj/ta&sourceUrl=%2Fexam%2Foj%2Fta%3FtpId%3D37&difficulty=undefined&judgeStatus=undefined&tags=&title=)

#### 亮点

- Scanner。
- 时间复杂度为 O(1)
- 空间复杂度为 O(1)


#### 实现

```java
public class Test003 {
    /**
     * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
     * 输入：hello now coder
     * 输出：5
     *
     * @param args 输入一行，代表要计算的字符串，非空，长度小于5000。
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (!input.contains(" ")) {
            System.out.println(input.length());
            return;
        }
        String[] split = input.split(" ");
        System.out.println(split[split.length - 1].length());
    }
}
```

### 2024-07-08 计算某字符出现次数

简单说下思路，很简单的一道题，主要考察Java基础知识的应用。

[计算某字符出现次数](https://www.nowcoder.com/practice/a35ce98431874e3a820dbe4b2d0508b1?tpId=37&rp=1&ru=%2Fexam%2Foj%2Fta&qru=%2Fexam%2Foj%2Fta&sourceUrl=%2Fexam%2Foj%2Fta%3FtpId%3D37&difficulty=&judgeStatus=&tags=&title=&gioEnter=menu)

#### 亮点

- char
- 分情况判断
- 时间复杂度为 O(1)
- 空间复杂度为 O(1)


#### 实现

```java
public class Test004 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        int count = 0;
        // System.out.print((int)' ');
        for (int i = 0; i < input1.length(); i++) {
            if (input2.charAt(0) == input1.charAt(i)) {
                count++;
                continue;
            }
            if (input2.charAt(0) == ' ') {
                continue;
            }
            if (input2.charAt(0) >= '1' && input2.charAt(0) <= '9') {
                continue;
            }
            // 字母的情况
            if (Math.abs((int)input2.charAt(0) - (int)input1.charAt(i)) == 32) {
                count++;
            }
        }
        System.out.print(count);
    }

}
```

### 2024-07-09 明明的随机数

明明生成了 N个1到500之间的随机整数。请你删去其中重复的数字， 即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。

输入描述：第一行先输入随机整数的个数 N 。 接下来的 N 行每行输入一个整数，代表明明生成的随机数。

```text
输入:
4
1
2
2
3
输出:
1
2
3
```

简单说下思路，题目限定了输入数字的范围，且一个数字只会出现一次，所以我们使用`boolean[] arr = new boolean[501]`来存储数字是否出现过，然后从前到后输出即可。

[明明的随机数](https://www.nowcoder.com/practice/3245215fffb84b7b81285493eae92ff0?tpId=37&rp=1&ru=%2Fexam%2Foj%2Fta&qru=%2Fexam%2Foj%2Fta&sourceUrl=%2Fexam%2Foj%2Fta%3FtpId%3D37&difficulty=&judgeStatus=3&tags=&title=&gioEnter=menu)

#### 亮点

- boolean数组，节省空间开销
- 使用 `BufferedReader` 读取控制台输入，减少时间开销
- 时间复杂度为 O(n)
- 空间复杂度为 O(n)


#### 实现

```java
@SuppressWarnings("all")
public class Test005 {
    /**
     * 明明生成了 N个1到500之间的随机整数。请你删去其中重复的数字，
     * 即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
     *
     * @param args 输入参数
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] arr = new boolean[501];
        int n = in.nextInt();
        while (n-- > 0) {
            // 注意 while 处理多个 case
            arr[in.nextInt()] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 500; i++) {
            if (arr[i]) {
                sb.append(i).append("\n");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    public void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] flag = new boolean[501];
        while (n-- > 0) {
            int tmp = Integer.parseInt(br.readLine());
            flag[tmp] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 500; i++) {
            if (flag[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}
```

#### 发现

牛客提交运行时，其执行时间会根据各种环境因素的影响而改变，比如，我用Java排名第一的代码执行，他执行时用了 8ms，我用同样的代码提交执行了 16 ms。

所以这个排行仅作参考就好了。

## leetcode

## 剑指offer

