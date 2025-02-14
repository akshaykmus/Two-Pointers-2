// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null)
            return 0;
        int slow = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;

    }
}