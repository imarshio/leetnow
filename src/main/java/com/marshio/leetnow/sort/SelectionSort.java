package com.marshio.leetnow.sort;

/**
 * @author marshio
 * @desc ...
 * @create 2024/7/22 17:13
 */

@SuppressWarnings("all")
public class SelectionSort {

    // 时间复杂度为 O(n^2)
    // 具体来说，这个过程需要 n−1 次比较来找到第一个元素，n−2 次比较来找到第二个元素，依此类推，直到最后只需要 1 次比较。
    // 总的比较次数是 (n−1)+(n−2)+…+1，这是一个等差数列求和，结果是 n(n−1)/2。

    public int[] selectionSort(int[] nums) {
        int size = nums.length;

        for (int i = size - 1; i >= 0; i--) {
            int maxIndex = 0;
            for (int j = maxIndex + 1; j <= i; j++) {
                if (nums[maxIndex] < nums[j]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                // swap
                int temp = nums[i];
                nums[i] = nums[maxIndex];
                nums[maxIndex] = temp;
            }
        }
        return nums;
    }
}
