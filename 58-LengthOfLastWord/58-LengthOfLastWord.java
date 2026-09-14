// Last updated: 9/14/2026, 1:27:39 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int l = 0;
        while(i>=0 && s.charAt(i)==' ')
          i--;
        while(i>=0 && s.charAt(i)!=' '){
          l++;
          i--;
        }
        return l;  
    }
}