// Last updated: 8/10/2026, 3:48:41 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        int maxFreq = 0;

        for (int i = 0; i < 101; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }

        int ans = 0;

        for (int i = 0; i < 101; i++) {
            if (freq[i] == maxFreq) {
                ans += freq[i];
            }
        }

        return ans;
    }
}