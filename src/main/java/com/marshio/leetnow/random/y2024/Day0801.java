package com.marshio.leetnow.random.Y2024;

/**
 * @author marshio
 * @desc ...
 * @create 2024/8/1 9:37
 */
public class Day0801 {

    // https://leetcode.com/problems/number-of-senior-citizens/description/?envType=daily-question&envId=2024-08-01

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(new Day0725().sortArray(new int[]{110, 100})));

        System.out.println(new Day0801().countSeniors(new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"}));
    }

    public int countSeniors(String[] details) {
        int num = 0;
        for (int i = 0; i < details.length; i++) {
            if (details[i].charAt(11) - '0' >= 6 && details[i].charAt(12) - '0' > 0) {
                num++;
            }
        }
        return num;
    }
}
