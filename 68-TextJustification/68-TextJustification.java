// Last updated: 9/14/2026, 1:27:17 PM
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i;
            int len = 0;

            // Find words that fit in one line
            while (j < words.length &&
                   len + words[j].length() + (j - i) <= maxWidth) {
                len += words[j].length();
                j++;
            }

            StringBuilder line = new StringBuilder();
            int gaps = j - i - 1;

            // Last line or only one word
            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        line.append(" ");
                    }
                }

                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                int spaces = (maxWidth - len) / gaps;
                int extra = (maxWidth - len) % gaps;

                for (int k = i; k < j; k++) {
                    line.append(words[k]);

                    if (k < j - 1) {
                        for (int s = 0; s < spaces; s++) {
                            line.append(" ");
                        }
                        if (extra > 0) {
                            line.append(" ");
                            extra--;
                        }
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}