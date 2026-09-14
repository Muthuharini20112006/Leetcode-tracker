// Last updated: 9/14/2026, 1:26:52 PM
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        return atMost(nums, k) - atMost(nums, k - 1);
4    }
5
6    public int atMost(int[] nums, int k) {
7        int[] freq = new int[nums.length + 1];
8
9        int left = 0;
10        int count = 0;
11        int result = 0;
12
13        for (int right = 0; right < nums.length; right++) {
14
15            if (freq[nums[right]] == 0) {
16                count++;
17            }
18
19            freq[nums[right]]++;
20
21            while (count > k) {
22                freq[nums[left]]--;
23
24                if (freq[nums[left]] == 0) {
25                    count--;
26                }
27
28                left++;
29            }
30
31            result += right - left + 1;
32        }
33
34        return result;
35    }
36}