// Last updated: 9/14/2026, 1:24:44 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character,Integer> m = new HashMap<>();
        Map<Character,Integer> k =new HashMap<>();

        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(Objects.equals(m.get(a), k.get(b))){
                m.put(a,i);
                k.put(b,i);
            }
            else{
                return false;
            }
        }
        return true;
    }
}