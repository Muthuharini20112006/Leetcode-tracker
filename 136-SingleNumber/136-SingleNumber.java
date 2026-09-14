// Last updated: 9/14/2026, 1:26:06 PM
class Solution {
    public int singleNumber(int[] nums) {
              int i,x=0;
        for(i=0;i<nums.length;i++){
           // nums[i]=sc.nextInt();
            x =x^nums[i];
        }
        return x;
    }
}