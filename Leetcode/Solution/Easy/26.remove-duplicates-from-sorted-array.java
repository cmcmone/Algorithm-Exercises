import java.util.Collections;

/*
 * @lc app=leetcode id=26 lang=java
 * @version 1.00 May 24, 2020
 * @author Ray Chen
 * 
 * Problem Description:
 * - see [26] Remove Duplicates from Sorted Array 
 * - https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int pos = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                nums[pos++] = nums[i];
            }
        }
        return pos;
    }
}
// @lc code=end

