// Last updated: 8/22/2026, 11:51:42 AM
1class Solution {
2    public List<List<Integer>> findWinners(int[][] matches) {
3        HashMap<Integer, Integer> loss = new HashMap<>();
4
5        for (int[] m : matches) {
6            int winner = m[0];
7            int loser = m[1];
8
9            loss.putIfAbsent(winner, 0);
10            loss.put(loser, loss.getOrDefault(loser, 0) + 1);
11        }
12
13        List<Integer> zero = new ArrayList<>();
14        List<Integer> one = new ArrayList<>();
15
16        for (int player : loss.keySet()) {
17            if (loss.get(player) == 0) {
18                zero.add(player);
19            } else if (loss.get(player) == 1) {
20                one.add(player);
21            }
22        }
23
24        Collections.sort(zero);
25        Collections.sort(one);
26
27        List<List<Integer>> ans = new ArrayList<>();
28        ans.add(zero);
29        ans.add(one);
30
31        return ans;
32    }
33}