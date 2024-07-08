package com.marshio.leetnow.huawei;

import java.util.Scanner;

/**
 * @author marshio
 * @desc ...
 * @create 2024/7/8 18:00
 */
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
