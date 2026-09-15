// Last updated: 9/15/2026, 4:18:21 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> set=new HashSet<>();
4
5        int l=0;
6        int m=0;
7
8        for(int r=0;r<s.length();r++){
9            while(set.contains(s.charAt(r))){
10                set.remove(s.charAt(l));
11                l++;
12            }
13            set.add(s.charAt(r));
14            m=Math.max(m,r-l+1);
15        }
16        return m;
17    }
18}