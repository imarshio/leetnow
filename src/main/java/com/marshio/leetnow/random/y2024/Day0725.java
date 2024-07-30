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

    private int doublePointerSwap(int[] nums, int start, int end) {
        int pivot = nums[start];
        int left = start;
        int right = end;
        while (left < right) {
            // 选左侧为基准值就需要从右侧开始
            while (left < right && nums[right] > pivot) {
                right--;
            }
            while (left < right && nums[left] <= pivot) {
                left++;
            }
            // 没过界就交换
            if (left < right) {
                // swap
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        nums[start] = nums[right];
        nums[right] = pivot;
        return right;
    }

    public void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        // 选择基准值,这里我们选择左侧为基准值
        int index = doublePointerSwap(nums, start, end);

        quickSort(nums, start, index - 1);
        quickSort(nums, index + 1, end);
    }


    public int[] sortArray(int[] nums) {
        int size = nums.length;
        // 使用快排
        quickSort(nums, 0, size - 1);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Day0725().sortArray(new int[]{110, 100, 0})));
        System.out.println(Arrays.toString(new Day0725().sortArray(new int[]{5, 7, 4, 3, 6, 2})));
    }
}
