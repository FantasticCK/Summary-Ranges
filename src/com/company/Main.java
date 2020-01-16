package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0)
            return res;
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                if (sb.charAt(sb.length() - 1) != '>') {
                    sb.append("->");
                }
                continue;
            } else {
                if (sb.charAt(sb.length() - 1) == '>') {
                    sb.append(nums[i - 1]);
                }
                res.add(sb.toString());
                sb = new StringBuilder();
                sb.append(nums[i]);
            }
        }
        if (sb.length() != 0) {
            if (sb.charAt(sb.length() - 1) == '>') {
                sb.append(nums[nums.length - 1]);
            }
            res.add(sb.toString());
        }
        return res;
    }
}