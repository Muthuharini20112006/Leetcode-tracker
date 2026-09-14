// Last updated: 9/14/2026, 1:28:47 PM


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int k = 0;

        for (int num : nums1)
            arr[k++] = num;

        for (int num : nums2)
            arr[k++] = num;

        java.util.Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 0)
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;

        return arr[n / 2];
    }
}