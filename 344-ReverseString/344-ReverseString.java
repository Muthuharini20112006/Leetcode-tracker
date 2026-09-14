// Last updated: 9/14/2026, 1:23:24 PM
class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int st=0,ed=n-1,i;
        char temp=0;
        while(st<=ed){
            temp=s[st];
            s[st]=s[ed];
            s[ed]=temp;
            st++;
            ed--;
        }
    }
}