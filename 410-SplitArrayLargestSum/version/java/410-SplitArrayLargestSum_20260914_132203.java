// Last updated: 9/14/2026, 1:22:03 PM
1class Solution {
2
3    public int splitArray(int[] nums, int k) {
4
5        int left = 0;
6        int right = 0;
7
8        // left = max element, right = total sum
9        for (int num : nums) {
10            left = Math.max(left, num);
11            right += num;
12        }
13
14        while (left < right) {
15
16            int mid = left + (right - left) / 2;
17
18            if (canSplit(nums, k, mid)) {
19                right = mid;
20            } else {
21                left = mid + 1;
22            }
23        }
24
25        return left;
26    }
27
28    private boolean canSplit(int[] nums, int k, int maxSum) {
29
30        int pieces = 1;
31        int current = 0;
32
33        for (int num : nums) {
34
35            if (current + num > maxSum) {
36                pieces++;
37                current = num;
38            } else {
39                current += num;
40            }
41        }
42
43        return pieces <= k;
44    }
45}