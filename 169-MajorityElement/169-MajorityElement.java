// Last updated: 9/14/2026, 1:25:47 PM
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i,c=0,t=0;
        for(i=0;i<n;i++){
            if(c==0)
            t=nums[i];
            if(t==nums[i])
            c++;
            else c--;
            }
            return t; 

    }
}