
/*

https://leetcode.com/problems/climbing-stairs/description/

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.


Example 1:

Input: 2
Output:  2
Explanation:  There are two ways to climb to the top.

1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output:  3
Explanation:  There are three ways to climb to the top.

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

 */

package com.ccc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print(climbStairs(4));
    }

    public static int climbStairs(int n) {

        if(n == 0 || n == 1 || n == 2) return n;

        int f0 = 1, f1 = 1;

        int result = 0;

        for(int i = 2; i <= n; i++) {
            result = f0 + f1;
            f1 = f0;
            f0 = result;
        }
        return result;
    }
}
