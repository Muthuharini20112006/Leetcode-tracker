// Last updated: 9/14/2026, 1:17:21 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String op : operations) {
            if (op.contains("++")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }
}