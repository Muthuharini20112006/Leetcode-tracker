// Last updated: 9/20/2026, 6:27:20 PM
1class Solution {
2    public boolean search(int[] nums, int target) {
3
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left <= right) {
8
9            int mid = left + (right - left) / 2;
10
11            if (nums[mid] == target) {
12                return true;
13            }
14
15            // Duplicates: cannot decide which half is sorted
16            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
17                left++;
18                right--;
19            }
20
21            // Left half is sorted
22            else if (nums[left] <= nums[mid]) {
23
24                if (nums[left] <= target && target < nums[mid]) {
25                    right = mid - 1;
26                } else {
27                    left = mid + 1;
28                }
29            }
30
31            // Right half is sorted
32            else {
33
34                if (nums[mid] < target && target <= nums[right]) {
35                    left = mid + 1;
36                } else {
37                    right = mid - 1;
38                }
39            }
40        }
41
42        return false;
43    }
44}