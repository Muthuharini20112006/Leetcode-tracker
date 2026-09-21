// Last updated: 9/21/2026, 10:14:49 PM
1
2
3public class Solution extends VersionControl {
4    public int firstBadVersion(int n) {
5
6        int left = 1;
7        int right = n;
8
9        while (left < right) {
10
11            int mid = left + (right - left) / 2;
12
13            if (isBadVersion(mid)) {
14                right = mid;
15            } else {
16                left = mid + 1;
17            }
18        }
19
20        return left;
21    }
22}
23