// Last updated: 9/14/2026, 1:22:20 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }
}