// Last updated: 9/14/2026, 1:17:36 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char ch = 'a'; ch <= 'z'; ch++) {
            if(sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}