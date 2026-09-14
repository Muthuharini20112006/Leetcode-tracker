// Last updated: 9/14/2026, 1:17:44 PM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String result = "";

        for (int i = 0; i < k; i++) {
            result += words[i];

            if (i < k - 1) {
                result += " ";
            }
        }

        return result;
    }
}