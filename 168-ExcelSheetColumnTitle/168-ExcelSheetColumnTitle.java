// Last updated: 9/14/2026, 1:25:48 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";

        while (columnNumber > 0) {
            columnNumber--;

            char ch = (char) ('A' + (columnNumber % 26));
            ans = ch + ans;

            columnNumber = columnNumber / 26;
        }

        return ans;
    }
}