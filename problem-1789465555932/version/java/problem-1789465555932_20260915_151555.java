// Last updated: 9/15/2026, 3:15:55 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3      int max=nums[0];
4      int min=nums[0];
5      int ans=nums[0];
6      for(int i=1;i<nums.length;i++){
7        if(nums[i]<0){
8            int temp=max;
9            max=min;
10            min=temp;
11
12        }
13        max=Math.max(nums[i],max*nums[i]);
14        min=Math.min(nums[i],min*nums[i]);
15        ans=Math.max(ans,max);
16      }
17      return ans;
18
19    }
20}