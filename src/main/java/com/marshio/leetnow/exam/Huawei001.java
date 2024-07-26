package com.marshio.leetnow.exam;

import java.util.*;

public class Huawei001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] arr = input.split(" ");
        String[] realArr = (input + input).split(" ");
        // String[] out = new String[arr.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int p = Integer.parseInt(arr[i]);
            int add = 0;
            for (int j = i + 1; j < realArr.length; j++) {
                int tmp = Integer.parseInt(realArr[j]);
                if (tmp >= p) {
                    continue;
                }
                add = tmp;
                break;
            }
            sb.append(p + add).append(" ");
        }
        System.out.print(sb.deleteCharAt(sb.lastIndexOf(" ")));

    }
}
