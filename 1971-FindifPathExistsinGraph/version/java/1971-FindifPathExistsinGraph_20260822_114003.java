// Last updated: 8/22/2026, 11:40:03 AM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int prev = n % 2;
4        n = n / 2;
5
6        while (n > 0) {
7            int curr = n % 2;
8
9            if (curr == prev) {
10                return false;
11            }
12
13            prev = curr;
14            n = n / 2;
15        }
16
17        return true;
18    }
19}