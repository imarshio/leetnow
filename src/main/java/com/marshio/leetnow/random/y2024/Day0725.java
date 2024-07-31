package com.marshio.leetnow.random.Y2024;

import java.util.Arrays;

/**
 * @author marshio
 * @desc ...
 * @create 2024/7/25 18:44
 */
@SuppressWarnings("all")
public class Day0725 {
    // https://leetcode.com/problems/sort-an-array/description/?envType=daily-question&envId=2024-07-25


    // 给定一个整数数组 nums ，按升序对数组进行排序并返回它。
    // [5,2,3,1] ==> [1,2,3,5]

    // 您必须在不使用任何内置函数的情况下以 O(nlog(n)) 时间复杂度和尽可能最小的空间复杂度解决问题。


    public int[] sortArray(int[] nums) {
        int size = nums.length;
        mergeSort(nums, 0, size - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid + 1, end);
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int size = end - start + 1;
        int[] temp = new int[size];
        int left = start;
        int right = mid;
        int index = 0;
        while (left < mid && right <= end) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
            }
        }
        while (left < mid) {
            temp[index++] = nums[left++];
        }
        while (right <= end) {
            temp[index++] = nums[right++];
        }
        for (int i = 0; i < size; i++) {
            nums[start++] = temp[i];
        }
    }

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(new Day0725().sortArray(new int[]{110, 100})));
        System.out.println(Arrays.toString(new Day0725().sortArray(new int[]{5, 7, 4, 3, 6, 2})));
    }
}
