// Last updated: 9/14/2026, 1:16:12 PM
class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int limit = n / 2;

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int x : nums1) set1.add(x);
        for (int x : nums2) set2.add(x);

        int common = 0;
        for (int x : set1) {
            if (set2.contains(x)) common++;
        }

        int only1 = set1.size() - common;
        int only2 = set2.size() - common;

        int take1 = Math.min(limit, only1);
        int take2 = Math.min(limit, only2);

        int rem1 = limit - take1;
        int rem2 = limit - take2;

        int takeCommon = Math.min(common, rem1 + rem2);

        return take1 + take2 + takeCommon;
    }
}