package com.jaravan.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by icer on 2017/12/6.
 */
public class TwoSum {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     * 典型的"2sum"问题
     * 时间复杂度  O(n)
     */

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 4, 7, 8};
        int[] result = twoSum(array, 11);
        System.out.println(result[0] + "   " + result[1]);
    }

}
