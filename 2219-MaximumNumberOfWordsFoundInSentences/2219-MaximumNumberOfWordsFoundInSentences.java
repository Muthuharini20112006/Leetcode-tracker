// Last updated: 8/10/2026, 3:49:40 PM
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