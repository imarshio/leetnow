package com.marshio.leetnow.sort;

/**
 * @author marshio
 * @desc ...
 * @create 2024/7/22 17:13
 */
@SuppressWarnings("all")
public class BubbleSort {

    public int[] bubbleSort(int[] nums) {
        int size = nums.length;

        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
