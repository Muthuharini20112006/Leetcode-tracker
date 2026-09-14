// Last updated: 9/14/2026, 1:23:32 PM
import java.util.*;

class Solution {

    public List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Store word and its index
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        // Check every word
        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            for (int j = 0; j <= word.length(); j++) {

                String left = word.substring(0, j);
                String right = word.substring(j);

                // If left part is palindrome
                if (isPalindrome(left)) {

                    String revRight = new StringBuilder(right).reverse().toString();

                    if (map.containsKey(revRight) && map.get(revRight) != i) {
                        result.add(Arrays.asList(map.get(revRight), i));
                    }
                }

                // If right part is palindrome
                // j != word.length() avoids duplicate pairs
                if (j != word.length() && isPalindrome(right)) {

                    String revLeft = new StringBuilder(left).reverse().toString();

                    if (map.containsKey(revLeft) && map.get(revLeft) != i) {
                        result.add(Arrays.asList(i, map.get(revLeft)));
                    }
                }
            }
        }

        return result;
    }

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}