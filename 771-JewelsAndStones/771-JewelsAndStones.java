// Last updated: 9/14/2026, 1:20:39 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1)
                count++;
        }

        return count;
    }
}