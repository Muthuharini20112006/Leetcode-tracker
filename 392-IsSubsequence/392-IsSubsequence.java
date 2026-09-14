// Last updated: 9/14/2026, 1:23:07 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
         int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                i++;

            j++;
        }

        return i == s.length();
    }
}