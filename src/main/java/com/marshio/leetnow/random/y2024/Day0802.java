package com.marshio.leetnow.random.Y2024;

/**
 * @author marshio
 * @desc ...
 * @create 2024/8/1 9:37
 */
public class Day0802 {

    // https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/description/?envType=daily-question&envId=2024-08-02

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(new Day0725().sortArray(new int[]{110, 100})));

        // System.out.println(new Day0802().minSwaps(new int[]{1, 1, 0, 0, 0, 0, 1}));
        System.out.println(new Day0802().minSwaps(new int[]{0, 1, 0, 1, 1, 0, 0}));
    }

    public int minSwaps(int[] nums) {
        // 滑动窗口
        int n = nums.length;
        int totalOnes = 0;
        for (int i : nums) {
            totalOnes += i;
        }
        if (0 == totalOnes || totalOnes == n) {
            // 边界情况
            return 0;
        }

        int left = 0;
        // 确定边界数值
        int right = left + totalOnes - 1;
        int sum = 0;
        // 根绝max确定窗口大小
        for (int i = left; i <= right; i++) {
            // 取模运算，模拟循环数组
            sum += nums[i];
        }
        // 3
        left++;
        right++;
        int maxOnesInWindow = sum;
        while (left < n) {
            // 计算窗口中有多少个1，max - count 就是需要交换的次数
            // 循环计算的话会超时，所以我们需要换一种思路来解决问题
            // 由于窗口的特性是：减去前一个，加上后一个，这样我们只需要知道第一个窗口有多少个1就可以了
            sum = sum - nums[left - 1] + nums[right % n];
            maxOnesInWindow = Math.max(sum, maxOnesInWindow);
            // 滑向下一个窗口的位置
            left++;
            right++;
        }

        return totalOnes - maxOnesInWindow;

    }

}
