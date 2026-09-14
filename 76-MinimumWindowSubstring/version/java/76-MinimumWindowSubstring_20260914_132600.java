// Last updated: 9/14/2026, 1:26:00 PM
1class Solution {
2    public String minWindow(String s, String t) {
3
4        if (s.length() < t.length()) return "";
5
6        int[] need = new int[128];
7
8        for (char c : t.toCharArray()) {
9            need[c]++;
10        }
11
12        int left = 0;
13        int count = t.length();
14
15        int minLen = Integer.MAX_VALUE;
16        int start = 0;
17
18        for (int right = 0; right < s.length(); right++) {
19
20            char c = s.charAt(right);
21
22            if (need[c] > 0) {
23                count--;
24            }
25
26            need[c]--;
27
28            while (count == 0) {
29
30                if (right - left + 1 < minLen) {
31                    minLen = right - left + 1;
32                    start = left;
33                }
34
35                char l = s.charAt(left);
36
37                need[l]++;
38
39                if (need[l] > 0) {
40                    count++;
41                }
42
43                left++;
44            }
45        }
46
47        return minLen == Integer.MAX_VALUE
48                ? ""
49                : s.substring(start, start + minLen);
50    }
51}