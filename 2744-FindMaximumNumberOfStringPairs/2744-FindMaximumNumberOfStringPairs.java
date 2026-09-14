// Last updated: 9/14/2026, 1:16:25 PM
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