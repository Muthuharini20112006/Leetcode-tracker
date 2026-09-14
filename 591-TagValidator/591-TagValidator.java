// Last updated: 9/14/2026, 1:21:52 PM
class Solution {
    public boolean isValid(String code) {
        Stack<String> stack = new Stack<>();
        int i = 0;
        int n = code.length();

        while (i < n) {

            // CDATA
            if (code.startsWith("<![CDATA[", i)) {
                if (stack.isEmpty()) return false;

                int end = code.indexOf("]]>", i);
                if (end == -1) return false;

                i = end + 3;
            }

            // Closing tag
            else if (code.startsWith("</", i)) {
                int end = code.indexOf('>', i);

                if (end == -1) return false;

                String tag = code.substring(i + 2, end);

                if (stack.isEmpty() || !stack.pop().equals(tag)) {
                    return false;
                }

                i = end + 1;

                // Root tag must be the last thing in the string
                if (stack.isEmpty() && i != n) {
                    return false;
                }
            }

            // Opening tag
            else if (code.charAt(i) == '<') {
                int end = code.indexOf('>', i);

                if (end == -1) return false;

                String tag = code.substring(i + 1, end);

                if (!isValidTag(tag)) {
                    return false;
                }

                stack.push(tag);
                i = end + 1;
            }

            // Text content
            else {
                if (stack.isEmpty()) return false;
                i++;
            }
        }

        return stack.isEmpty();
    }

    private boolean isValidTag(String tag) {
        if (tag.length() < 1 || tag.length() > 9) {
            return false;
        }

        for (char c : tag.toCharArray()) {
            if (c < 'A' || c > 'Z') {
                return false;
            }
        }

        return true;
    }
}