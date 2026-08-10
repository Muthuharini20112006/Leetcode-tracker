// Last updated: 8/10/2026, 3:49:47 PM
class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;

        for (String word : words1) {
            int c1 = 0, c2 = 0;

            for (String w : words1) {
                if (word.equals(w))
                    c1++;
            }

            for (String w : words2) {
                if (word.equals(w))
                    c2++;
            }

            if (c1 == 1 && c2 == 1)
                count++;
        }

        return count;
    }
}
