package com.gosssen.myleetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]

        Constraints:
        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        Only one valid answer exists.

        Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
    */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int neededValue;
        for (int i = 0; i < nums.length; i++) {
            neededValue = target - nums[i];
            if (map.containsKey(neededValue)) {
                return new int[]{map.get(neededValue), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] twoSum1 = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] twoSum2 = new TwoSum().twoSum(new int[]{3, 2, 4}, 6);
        int[] twoSum3 = new TwoSum().twoSum(new int[]{3, 3}, 6);
        System.out.println("twoSum1[" + twoSum1[0] + ", " + twoSum1[1] + "]");
        System.out.println("twoSum2[" + twoSum2[0] + ", " + twoSum2[1] + "]");
        System.out.println("twoSum3[" + twoSum3[0] + ", " + twoSum3[1] + "]");
    }
}
