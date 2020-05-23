import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        var map = new HashMap<Integer, Integer>();
        int remainder;
        for (int i = 0; i < nums.length; i++) {
            remainder = target - nums[i];
            if (map.containsKey(remainder)) {
                ret[0] = map.get(remainder);
                ret[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return ret;
    }
}
// @lc code=end

