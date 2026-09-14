// Last updated: 9/14/2026, 1:28:35 PM
class Solution {
    int value(char c){
        switch(c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X': return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i+1<s.length()){
                char next=s.charAt(i+1);
                if(value(c)>=value(next))
                res+=value(c);
                else{
                    res+=value(next)-value(c);
                    i++;
                }
            }
            else{
                res+=value(c);
            }
        }
        return res;
    }
}

// int total = 0, prev = 0;

//         for (int i = s.length() - 1; i >= 0; i--) {
//             int curr = 0;
//             char c = s.charAt(i);

//             if (c == 'I') curr = 1;
//             else if (c == 'V') curr = 5;
//             else if (c == 'X') curr = 10;
//             else if (c == 'L') curr = 50;
//             else if (c == 'C') curr = 100;
//             else if (c == 'D') curr = 500;
//             else if (c == 'M') curr = 1000;

//             total += (curr < prev) ? -curr : curr;
//             prev = curr;
//         }
//         return total;