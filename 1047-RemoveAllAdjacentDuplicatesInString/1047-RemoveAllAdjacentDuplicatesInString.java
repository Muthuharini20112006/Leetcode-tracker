// Last updated: 9/14/2026, 1:19:36 PM
import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}