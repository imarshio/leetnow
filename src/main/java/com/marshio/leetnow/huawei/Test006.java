package com.marshio.leetnow.huawei;

import java.util.*;

/**
 * @author marshio
 * @desc ...
 * @create 2024/7/9 11:07
 */
public class Test006 {

    /**
     * <a href="https://www.nowcoder.com/practice/f9c6f980eeec43ef85be20755ddbeaf4?tpId=37&rp=1&ru=%2Fexam%2Foj%2Fta&qru=%2Fexam%2Foj%2Fta&sourceUrl=%2Fexam%2Foj%2Fta%3FtpId%3D37&difficulty=&judgeStatus=3&tags=&title=&gioEnter=menu">购物单</a>
     * 王强决定把年终奖用于购物，他把想买的物品分为两类：主件与附件，附件是从属于某个主件的，下表就是一些主件与附件的例子：
     * 主件	附件
     * 电脑	打印机，扫描仪
     * 书柜	图书
     * 书桌	台灯，文具
     * 工作椅	无
     * 如果要买归类为附件的物品，必须先买该附件所属的主件，且每件物品只能购买一次。
     * 每个主件可以有 0 个、 1 个或 2 个附件。附件不再有从属于自己的附件。
     * 王强查到了每件物品的价格（都是 10 元的整数倍），而他只有 N 元的预算。除此之外，他给每件物品规定了一个重要度，用整数 1 ~ 5 表示。
     * 他希望在花费不超过 N 元的前提下，使自己的满意度达到最大。
     * <p>
     * 满意度是指所购买的每件物品的价格与重要度的乘积的总和，假设设第 i 件物品的价格为 v[i]，重要度为 w[i]，
     * 共选中了 k件物品，编号依次为 j1, j2, ..., jk,
     * 则满意度为：v[j1] * w[j1] + v[j2] * w[j2] + ... + v[jk] * w[jk]（其中 * 为乘号）
     * 请你帮助王强计算可获得的最大的满意度。
     * <p>
     * 输入
     * 50 5
     * 价格 重要度 主附件
     * 20 3 5
     * 20 3 5
     * 10 3 0
     * 10 2 0
     * 10 1 0
     * 输出
     * 130
     * 解释
     * 由第1行可知总钱数N为50以及希望购买的物品个数m为5；
     * 第2和第3行的q为5，说明它们都是编号为5的物品的附件；
     * 第4~6行的q都为0，说明它们都是主件，它们的编号依次为3~5；
     * 所以物品的价格与重要度乘积的总和的最大值为10*1+20*3+20*3=130
     *
     * @param args 输入参数
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}
