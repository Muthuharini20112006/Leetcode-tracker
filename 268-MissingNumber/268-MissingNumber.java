// Last updated: 9/14/2026, 1:24:03 PM
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,x;
        int n=nums.length;
        for( int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        x=n*(n+1)/2;
        int a=x-sum;
        return a;

        
    }
}