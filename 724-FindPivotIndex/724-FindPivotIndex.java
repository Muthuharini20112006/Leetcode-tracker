// Last updated: 9/14/2026, 1:21:02 PM
class Solution {
    public int pivotIndex(int[] nums) {

        int total = 0;

        for (int num : nums)
            total += num;

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            int rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum)
                return i;

            leftSum += nums[i];
        }

        return -1;
    }
}