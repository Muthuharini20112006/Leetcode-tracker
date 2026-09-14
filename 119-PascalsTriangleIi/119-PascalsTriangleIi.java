// Last updated: 9/14/2026, 1:26:22 PM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long value = 1; // use long to avoid overflow during calculation

        for (int k = 0; k <= rowIndex; k++) {
            row.add((int) value);
            value = value * (rowIndex - k) / (k + 1);
        }
        return row;
    }
}
