// Last updated: 8/10/2026, 3:48:54 PM
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String reverse = new StringBuilder(words[j]).reverse().toString();

                if (words[i].equals(reverse)) {
                    count++;
                }
            }
        }

        return count;
    }
}