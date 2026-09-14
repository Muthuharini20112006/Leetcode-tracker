// Last updated: 9/14/2026, 1:26:20 PM
class Solution {
    public int maxProfit(int[] prices) {
        int mp= Integer.MAX_VALUE;
        int MP= 0;

        for (int price : prices) {
            if (price < mp) {
                mp = price;
            } else {
                MP= Math.max(MP, price - mp);
            }
        }

        return MP;
    }
}
