// Last updated: 9/14/2026, 1:24:11 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();
             Arrays.sort(a);
             char[] b=t.toCharArray();
            Arrays.sort(b);
            return Arrays.equals(a,b);
    }
}
//                 if (s.length() != t.length()) 
//                 return false;
       
//         int[] count = new int[26]; // for lowercase letters
       
//         for (int i = 0; i < s.length(); i++) {
//             count[s.charAt(i) - 'a']++;
//             count[t.charAt(i) - 'a']--;
//         }
       
//         for (int c : count) {
//             if (c != 0) return false;
//         }
       
//         return true;
//     }
// }
 