package com.marshio.leetnow.huawei;

/**
 * @author marshio
 * @desc ...
 * @create 2024/7/9 11:07
 */
public class Test008 {

    /**
     * 给定一个长度为n的数组nums，请你找到峰值并返回其索引。数组可能包含多个峰值，在这种情况下，返回任何一个所在位置即可。
     * 1.峰值元素是指其值严格大于左右相邻值的元素。严格大于即不能有等于
     * 2.假设 nums[-1] = nums[n] =
     * 3.对于所有有效的 i 都有 nums[i] != nums[i + 1]
     * 4.你可以使用O(logN)的时间复杂度实现此问题吗？
     * <p>
     * 输入：[2,4,1,2,7,8,4]
     * 输出：1
     * 4和8都是峰值元素，返回4的索引1或者8的索引5都可以
     *
     * @param args 输入参数
     */
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 2, 7, 8, 4};
        System.out.println(new Test008().findPeakElement(nums));
    }

    public int findPeakElement(int[] nums) {
        // write code here
        if (nums.length == 1) {
            return 0;
        }
        int size = nums.length;
        int left = 0;
        int right = size - 1;
        // 2 3 4 5 6
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // 有可能是个峰值
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
