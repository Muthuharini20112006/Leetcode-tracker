// Last updated: 9/15/2026, 9:11:25 PM
1class Solution {
2    public String countAndSay(int n) {
3        String result="1";
4        for(int i=2;i<=n;i++){
5            StringBuilder sb = new StringBuilder();
6            int c=1;
7            for(int j=1;j<result.length();j++){
8                if (result.charAt(j) == result.charAt(j - 1)) {
9                    c++;
10                } else {
11                    sb.append(c);
12                    sb.append(result.charAt(j - 1));
13                    c = 1;
14            }
15        }
16        sb.append(c);
17        sb.append(result.charAt(result.length() - 1));
18          result = sb.toString();
19        }
20           return result;
21    }
22}