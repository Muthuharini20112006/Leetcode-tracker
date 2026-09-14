// Last updated: 9/14/2026, 1:28:21 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // edge case
        
        int k = 1; // pointer for the next unique element
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) { 
                nums[k] = nums[i]; // place unique element at position k
                k++;               // move k forward
            }
        }
        
        return k; // number of unique elements
    }
}
