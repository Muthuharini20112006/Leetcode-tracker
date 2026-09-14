// Last updated: 9/14/2026, 1:20:29 PM
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0,high=n-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]<target)
            low=mid+1;
            else
            high=mid-1;
       }
            return -1; 
   }
}