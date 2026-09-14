// Last updated: 9/14/2026, 1:15:54 PM
class Solution {
    public int countKeyChanges(String s) {
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) !=
                Character.toLowerCase(s.charAt(i - 1))) {
                count++;
            }
        }

        return count;
    }
}
