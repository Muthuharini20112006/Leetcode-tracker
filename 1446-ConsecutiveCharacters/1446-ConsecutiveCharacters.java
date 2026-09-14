// Last updated: 9/14/2026, 1:18:17 PM
class Solution {
    public int maxPower(String s) {
        int max = 1;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}