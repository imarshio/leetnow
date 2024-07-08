package com.marshio.leetnow.huawei;

import java.util.Scanner;

/**
 * @author marshio
 * @desc ...
 * @create 2024/7/8 17:07
 */
public class Test003 {
    /**
     * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
     * <a href="https://www.nowcoder.com/practice/8c949ea5f36f422594b306a2300315da?tpId=37&tqId=21224&rp=1&ru=/exam/oj/ta&qru=/exam/oj/ta&sourceUrl=%2Fexam%2Foj%2Fta%3FtpId%3D37&difficulty=undefined&judgeStatus=undefined&tags=&title=">...</a>
     * 输入：hello nowcoder
     * 输出：8
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
