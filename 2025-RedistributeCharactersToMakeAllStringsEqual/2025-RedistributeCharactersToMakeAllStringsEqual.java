// Last updated: 8/10/2026, 3:49:55 PM
class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                count[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}