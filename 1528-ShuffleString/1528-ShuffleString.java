// Last updated: 9/14/2026, 1:18:05 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[indices[i]] = s.charAt(i);
        }

        return new String(arr);
    }
}
