
/*

https://leetcode.com/problems/guess-number-higher-or-lower/description/

We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
Example:
n = 10, I pick 6.

Return 6.

 */


package com.ccc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print(guessNumber(10));
    }

    static int guess(int num) {
        int n = 3;
        if (n > num) {
            return 1;
        } else if (n < num) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int guessNumber(int n) {
        int lo = 1, hi = n;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (guess(mid) == 1) {
                lo = mid + 1;
            } else if (guess(mid) == -1) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
