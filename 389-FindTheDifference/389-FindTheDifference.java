// Last updated: 9/14/2026, 1:23:08 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;

        for (char c : t.toCharArray()) {
            sum += c;
        }

        for (char c : s.toCharArray()) {
            sum -= c;
        }

        return (char) sum;
    }
}