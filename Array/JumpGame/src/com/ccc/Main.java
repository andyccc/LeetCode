
/*

https://leetcode.com/problems/jump-game/description/

Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
 */

package com.ccc;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean canJump(int[] nums) {

        if (nums == null || nums.length == 0) return true;

        int maxReachIdx = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > maxReachIdx) return false;
            maxReachIdx = Math.max(nums[i] + i, maxReachIdx);
        }

        return true;
    }
}
