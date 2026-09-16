// Last updated: 9/16/2026, 9:38:07 AM
1class RandomizedSet {
2
3    HashMap<Integer, Integer> map;
4    ArrayList<Integer> list;
5    Random rand;
6
7    public RandomizedSet() {
8        map = new HashMap<>();
9        list = new ArrayList<>();
10        rand = new Random();
11    }
12
13    public boolean insert(int val) {
14        if (map.containsKey(val)) {
15            return false;
16        }
17
18        list.add(val);
19        map.put(val, list.size() - 1);
20
21        return true;
22    }
23
24    public boolean remove(int val) {
25        if (!map.containsKey(val)) {
26            return false;
27        }
28
29        int index = map.get(val);
30        int last = list.get(list.size() - 1);
31
32        // Move last element to removed position
33        list.set(index, last);
34        map.put(last, index);
35
36        // Remove last element
37        list.remove(list.size() - 1);
38        map.remove(val);
39
40        return true;
41    }
42
43    public int getRandom() {
44        int index = rand.nextInt(list.size());
45        return list.get(index);
46    }
47}