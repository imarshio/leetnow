package com.marshio.leetnow.random.Y2024;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marshio
 * @desc ...
 * @create 2024/8/7 13:58
 */
@SuppressWarnings("all")
public class Day0807 {
    // https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/?envType=study-plan-v2&envId=top-100-liked

    // Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
    //
    // A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) {
            return result;
        }
        // 2-9
        List<String> temp = new ArrayList<>();
        String[] nums = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < digits.length(); i++) {
            temp.add(nums[digits.charAt(i) - '0']);
        }

        return null;
    }

    public static void main(String[] args) {
        Integer i = new Integer(0);
        Integer j = new Integer(0);
        System.out.println(i == j);
        Integer x = new Integer(500);
        Integer y = new Integer(500);
        System.out.println(x == y);
    }

    public static void add(Integer i) {
        i += 1;
        i = new Integer(i);
    }
}
