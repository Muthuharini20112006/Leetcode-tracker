// Last updated: 9/14/2026, 1:18:46 PM
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> loss = new HashMap<>();

        for (int[] m : matches) {
            int winner = m[0];
            int loser = m[1];

            loss.putIfAbsent(winner, 0);
            loss.put(loser, loss.getOrDefault(loser, 0) + 1);
        }

        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();

        for (int player : loss.keySet()) {
            if (loss.get(player) == 0) {
                zero.add(player);
            } else if (loss.get(player) == 1) {
                one.add(player);
            }
        }

        Collections.sort(zero);
        Collections.sort(one);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(zero);
        ans.add(one);

        return ans;
    }
}