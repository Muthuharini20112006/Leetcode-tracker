// Last updated: 9/14/2026, 1:18:02 PM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    max = Math.max(max, j - i - 1);
                }
            }
        }

        return max;
    }
}