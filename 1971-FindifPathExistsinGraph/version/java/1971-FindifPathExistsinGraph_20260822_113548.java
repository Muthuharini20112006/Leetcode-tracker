// Last updated: 8/22/2026, 11:35:48 AM
1class NumArray {
2
3    private int[] prefix;
4
5    public NumArray(int[] nums) {
6        prefix = new int[nums.length + 1];
7
8        for (int i = 0; i < nums.length; i++) {
9            prefix[i + 1] = prefix[i] + nums[i];
10        }
11    }
12
13    public int sumRange(int left, int right) {
14        return prefix[right + 1] - prefix[left];
15    }
16}
17