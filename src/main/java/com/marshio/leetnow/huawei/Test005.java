package com.marshio.leetnow.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author marshio
 * @desc ...
 * @create 2024/7/9 9:44
 */
@SuppressWarnings("all")
public class Test005 {
    /**
     * 明明生成了 N个1到500之间的随机整数。请你删去其中重复的数字，
     * 即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
     * <p>
     * 输入描述：第一行先输入随机整数的个数 N 。 接下来的 N 行每行输入一个整数，代表明明生成的随机数。
     * <p>
     * 输入:
     * 4
     * 1
     * 2
     * 2
     * 3
     * <p>
     * 输出：1
     * 2
     * 3
     *
     * @param args 输入参数
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] arr = new boolean[501];
        // int 四个字节 * 501 = 2004 字节 = 2004 B
        // 1 字节 = 1
        // 1 byte = 8 bit = 1 B
        // 1 KB = 1024 B
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
