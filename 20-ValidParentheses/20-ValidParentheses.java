// Last updated: 9/14/2026, 1:28:28 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
    for (char ch:s.toCharArray()){
        if(ch=='('|| ch=='{'|| ch=='['){
            stack.push(ch);
        }
        else{
            if(stack.isEmpty()){
                return false;
            }
            char top=stack.pop();
             if ((ch == ')' && top != '(')|| (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
        }
    }
    return stack.isEmpty();
    }
}