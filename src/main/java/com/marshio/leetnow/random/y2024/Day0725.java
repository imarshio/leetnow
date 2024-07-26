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
    public int[] quickSort(int[] nums, int start, int end) {
        // 选择基准值
        int pivot = nums[start];
        nums[]
        while (start < end) {
            if (nums[start]) {

            }
        }
        return nums;
    }

    public int[] sortArray(int[] nums) {
        int size = nums.length;
        // 使用快排
        quickSort(nums, 0, size - 1);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Day0725().sortArray(new int[]{5, 7, 4, 3, 6, 2})));
    }
}
