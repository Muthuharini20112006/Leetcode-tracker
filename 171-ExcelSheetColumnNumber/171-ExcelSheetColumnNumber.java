// Last updated: 9/14/2026, 1:25:45 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for(int i=0;i<columnTitle.length();i++){
            int val=columnTitle.charAt(i)-'A'+1;
            res=res*26+val;

        }
        return res;
    }
}