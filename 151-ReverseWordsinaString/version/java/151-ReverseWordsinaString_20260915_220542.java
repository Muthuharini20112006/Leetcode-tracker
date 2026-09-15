// Last updated: 9/15/2026, 10:05:42 PM
1
2
3class Solution {
4    public int sumDistance(int[] nums, String s, int d) {
5
6        int n = nums.length;
7        long MOD = 1_000_000_007L;
8
9        long[] pos = new long[n];
10
11        // Calculate final positions
12        for (int i = 0; i < n; i++) {
13            if (s.charAt(i) == 'L') {
14                pos[i] = (long) nums[i] - d;
15            } else {
16                pos[i] = (long) nums[i] + d;
17            }
18        }
19
20        Arrays.sort(pos);
21
22        long ans = 0;
23        long prefix = 0;
24
25        for (int i = 0; i < n; i++) {
26            ans = (ans + (pos[i] * i - prefix) % MOD) % MOD;
27            prefix += pos[i];
28        }
29
30        ans = (ans + MOD) % MOD;
31
32        return (int) ans;
33    }
34}