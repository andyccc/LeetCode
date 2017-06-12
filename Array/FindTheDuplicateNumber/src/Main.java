
/*

https://leetcode.com/problems/find-the-duplicate-number/description/

Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
prove that at least one duplicate number must exist. Assume that there is only one duplicate number,
find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 */

public class Main {

    public static void main(String[] args) {
        int[] nums = {2,5,1,1,4,3};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {

        if (nums == null || nums.length == 1) return -1;

        int slow = nums.length, fast = nums.length;

        do {
            slow = nums[slow - 1];
            fast = nums[nums[fast - 1] - 1];
        } while (slow != fast);

        slow = nums.length;
        while (slow != fast) {
            slow = nums[slow - 1];
            fast = nums[fast - 1];
        }

        return slow;
    }
}
