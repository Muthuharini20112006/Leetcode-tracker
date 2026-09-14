// Last updated: 9/14/2026, 1:16:45 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int total = 0;
4
5        int maxSum = nums[0];
6        int curMax = 0;
7
8        int minSum = nums[0];
9        int curMin = 0;
10
11        for (int num : nums) {
12            curMax = Math.max(curMax + num, num);
13            maxSum = Math.max(maxSum, curMax);
14
15            curMin = Math.min(curMin + num, num);
16            minSum = Math.min(minSum, curMin);
17
18            total += num;
19        }
20
21        // all numbers are negative
22        if (maxSum < 0) {
23            return maxSum;
24        }
25
26        return Math.max(maxSum, total - minSum);
27    }
28}