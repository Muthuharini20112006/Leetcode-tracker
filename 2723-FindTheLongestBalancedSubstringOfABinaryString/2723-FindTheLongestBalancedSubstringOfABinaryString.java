// Last updated: 8/10/2026, 3:49:06 PM
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int max = 0;
        int zeros = 0;
        int ones = 0;

        for (int i = 0; i < s.length(); i++) {
            zeros = 0;
            ones = 0;

            while (i < s.length() && s.charAt(i) == '0') {
                zeros++;
                i++;
            }

            while (i < s.length() && s.charAt(i) == '1') {
                ones++;
                i++;
            }

            max = Math.max(max, 2 * Math.min(zeros, ones));
            i--;
        }

        return max;
    }
}