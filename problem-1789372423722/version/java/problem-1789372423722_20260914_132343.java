// Last updated: 9/14/2026, 1:23:43 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5
6        // Left products
7        ans[0] = 1;
8        for (int i = 1; i < n; i++) {
9            ans[i] = ans[i - 1] * nums[i - 1];
10        }
11
12        // Right products
13        int right = 1;
14        for (int i = n - 1; i >= 0; i--) {
15            ans[i] = ans[i] * right;
16            right = right * nums[i];
17        }
18
19        return ans;
20    }
21}