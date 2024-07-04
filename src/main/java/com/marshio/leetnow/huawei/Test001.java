package com.marshio.leetnow.huawei;

/**
 * @author marshio
 * @desc ...
 * @create 2024/7/4 13:26
 */
public class Test001 {

    public static void main(String[] args) {
        System.out.println(new Test001().solve("1", "99"));
    }

    /**
     * <p>
     * 计算两个数之和
     *
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public String solve(String s, String t) {
        // write code here
        int sLength = s.length();
        int tLength = t.length();
        int maxLength = Math.max(sLength, tLength);
        int[] result = new int[maxLength + 1];
        int index = 0;
        int carry = 0;
        for (int i = maxLength; i > 0; i--) {
            var mid = s.charAt(sLength - index - 1) - 48
                    + t.charAt(tLength - index - 1) - 48;
            result[index++] = (mid + carry) % 10;
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
}
