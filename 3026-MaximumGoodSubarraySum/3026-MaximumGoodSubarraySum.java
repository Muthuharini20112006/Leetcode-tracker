// Last updated: 9/14/2026, 1:16:06 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Long> map = new HashMap<>();
       
        long prefix = 0;
        long ans = Long.MIN_VALUE;
       
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, prefix);
            } else {
                map.put(num, Math.min(map.get(num), prefix));
            }
           
            prefix += num;
           
            if (map.containsKey(num - k)) {
                ans = Math.max(ans, prefix - map.get(num - k));
            }
           
            if (map.containsKey(num + k)) {
                ans = Math.max(ans, prefix - map.get(num + k));
            }
        }
       
        return ans == Long.MIN_VALUE ? 0 : ans;
    }
}
