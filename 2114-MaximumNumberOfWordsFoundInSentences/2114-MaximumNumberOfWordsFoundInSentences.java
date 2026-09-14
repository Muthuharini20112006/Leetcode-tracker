// Last updated: 9/14/2026, 1:17:14 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String s : sentences) {
            int words = s.split(" ").length;
            max = Math.max(max, words);
        }

        return max;
    }
}