// Last updated: 9/14/2026, 1:27:25 PM
class Solution {
    public boolean isNumber(String s) {
        s=s.trim();
        return s.matches(
            "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?");
              
    }
}