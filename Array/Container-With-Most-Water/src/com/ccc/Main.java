
/*

https://leetcode.com/problems/container-with-most-water/description/

Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,
which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

 */

package com.ccc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] x = {1,1};
        System.out.print(maxArea(x));
    }

    public static int maxArea(int[] height) {

        int max = 0;
        int i = 0, j = height.length - 1;
        while (i != j) {
            if (height[i] < height[j]) {
                max = Math.max(height[i] * (j - i), max);
                i ++;
            } else {
                max = Math.max(height[j] * (j - i), max);
                j --;
            }
        }

        return max;
    }
}
