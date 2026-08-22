// Last updated: 8/22/2026, 11:48:47 AM
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        HashMap<Integer, Long> map = new HashMap<>();
4       
5        long prefix = 0;
6        long ans = Long.MIN_VALUE;
7       
8        for (int num : nums) {
9            if (!map.containsKey(num)) {
10                map.put(num, prefix);
11            } else {
12                map.put(num, Math.min(map.get(num), prefix));
13            }
14           
15            prefix += num;
16           
17            if (map.containsKey(num - k)) {
18                ans = Math.max(ans, prefix - map.get(num - k));
19            }
20           
21            if (map.containsKey(num + k)) {
22                ans = Math.max(ans, prefix - map.get(num + k));
23            }
24        }
25       
26        return ans == Long.MIN_VALUE ? 0 : ans;
27    }
28}
29