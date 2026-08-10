// Last updated: 8/10/2026, 3:50:40 PM
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