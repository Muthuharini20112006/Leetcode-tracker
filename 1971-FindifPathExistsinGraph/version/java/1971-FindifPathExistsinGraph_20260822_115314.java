// Last updated: 8/22/2026, 11:53:14 AM
1class Solution {
2    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
3
4        // Rook can capture queen
5        if (a == e) {
6            if (!(c == a && d > Math.min(b, f) && d < Math.max(b, f))) {
7                return 1;
8            }
9        }
10
11        if (b == f) {
12            if (!(d == b && c > Math.min(a, e) && c < Math.max(a, e))) {
13                return 1;
14            }
15        }
16
17        // Bishop can capture queen
18        if (Math.abs(c - e) == Math.abs(d - f)) {
19            if (!(Math.abs(a - e) == Math.abs(b - f) &&
20                  a > Math.min(c, e) && a < Math.max(c, e) &&
21                  b > Math.min(d, f) && b < Math.max(d, f))) {
22                return 1;
23            }
24        }
25
26        return 2;
27    }
28}