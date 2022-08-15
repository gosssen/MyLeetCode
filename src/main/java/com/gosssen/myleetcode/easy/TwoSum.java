package com.gosssen.myleetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int neededValue = 0;
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
        int[] twoSum = new TwoSum().twoSum(new int[] {3, 3}, 6);
        System.out.println("[" + twoSum[0] + ", " + twoSum[1] + "]");
    }
}
