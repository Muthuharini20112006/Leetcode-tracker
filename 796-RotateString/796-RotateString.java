// Last updated: 9/14/2026, 1:20:27 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String str = s + s;
        return str.contains(goal);
    }
}
