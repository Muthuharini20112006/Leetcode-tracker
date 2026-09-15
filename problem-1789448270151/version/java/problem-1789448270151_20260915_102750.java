// Last updated: 9/15/2026, 10:27:50 AM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        map.put(0,1);
5        int s=0;
6        int c=0;
7        for(int num:nums){
8            s+=num;
9            if(map.containsKey(s-k)){
10                c+=map.get(s-k);
11            }
12            map.put(s,map.getOrDefault(s,0)+1);
13        }
14        return c;
15    }
16}