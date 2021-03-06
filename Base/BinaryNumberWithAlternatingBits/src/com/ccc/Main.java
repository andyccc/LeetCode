
/*

https://leetcode.com/problems/binary-number-with-alternating-bits/description/

Given a positive integer, check whether it has alternating bits:
namely, if two adjacent bits will always have different values.

Example 1:
Input: 5
Output: True
Explanation:
The binary representation of 5 is: 101
Example 2:
Input: 7
Output: False
Explanation:
The binary representation of 7 is: 111.
Example 3:
Input: 11
Output: False
Explanation:
The binary representation of 11 is: 1011.
Example 4:
Input: 10
Output: True
Explanation:
The binary representation of 10 is: 1010.

 */


package com.ccc;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    public boolean hasAlternatingBits(int n) {
        String bitsStr = Integer.toBinaryString(n);
        if (bitsStr.length() == 1) return true;
        for (int i = 1; i < bitsStr.length(); ++ i) {
            if (bitsStr.charAt(i) == bitsStr.charAt(i - 1)) return false;
        }
        return true;
    }
}
