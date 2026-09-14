// Last updated: 9/14/2026, 1:20:20 PM
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int min = n;

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == c) {
                    int d = Math.abs(i - j);
                    if (d < min) {
                        min = d;
                    }
                }
            }

            ans[i] = min;
        }

        return ans;
    }
}