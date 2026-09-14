// Last updated: 9/14/2026, 1:15:09 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4
5        for (int num : nums) {
6            set.add(num);
7        }
8
9        int longest = 0;
10
11        for (int num : set) {
12            // start of sequence
13            if (!set.contains(num - 1)) {
14                int current = num;
15                int count = 1;
16
17                while (set.contains(current + 1)) {
18                    current++;
19                    count++;
20                }
21
22                longest = Math.max(longest, count);
23            }
24        }
25
26        return longest;
27    }
28}
29