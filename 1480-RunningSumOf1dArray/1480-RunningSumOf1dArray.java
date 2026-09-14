// Last updated: 9/14/2026, 1:18:16 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
// int res[]=new int[n];
        for(int i=1;i<n;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}