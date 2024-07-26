package com.marshio.leetnow.exam;

import java.util.*;


/**
 * @author masuo
 * @data 2022/3/25 15:05
 * @Description
 */

@SuppressWarnings("all")
public class Huawei002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());
        String[] arr = in.nextLine().split(" ");
        int min = Integer.parseInt(in.nextLine());
        // int[] tmp =
        // 排序
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int left = Integer.parseInt(arr[j]);
                int right = Integer.parseInt(arr[j + 1]);
                if (left > right) {
                    arr[j] = right + "";
                    arr[j + 1] = left + "";
                }

            }
        }
        int left = 0;
        int right = arr.length - 1;
        int max = 0;
        while (left < right) {
            if (Integer.parseInt(arr[right]) >= min) {
                max++;
                right--;
                continue;
            }
            int tmp = Integer.parseInt(arr[right]) + Integer.parseInt(arr[left]);
            if (tmp >= min) {
                max++;
                right--;
                left++;
                continue;
            }
        }
    }
}
