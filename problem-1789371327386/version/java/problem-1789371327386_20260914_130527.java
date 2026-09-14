// Last updated: 9/14/2026, 1:05:27 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow=nums[0];
4        int fast=nums[0];
5        do{
6            slow=nums[slow];
7            fast=nums[nums[fast]];
8    }
9    while(slow!=fast);
10    slow=nums[0];
11    while(slow!=fast){
12        slow=nums[slow];
13        fast=nums[fast];
14    
15    }
16    return slow;
17    }
18}