// Last updated: 8/10/2026, 3:50:02 PM
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