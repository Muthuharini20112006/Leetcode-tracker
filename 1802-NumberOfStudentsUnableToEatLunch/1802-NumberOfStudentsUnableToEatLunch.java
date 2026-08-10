// Last updated: 8/10/2026, 3:50:19 PM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        //store sandwiches in stack(0th should be in top)
        for(int i=sandwiches.length-1;i>=0;i--)
        st.push(sandwiches[i]);

        for(int stud:students)
        q.add(stud);

        int t=0;                             
        while(!q.isEmpty() && !st.isEmpty() && t<st.size()){
            if(q.peek()==st.peek()){
                st.pop();
                q.poll();
                t=0;  ////slae-waiting time -0
            }
            else{
                t++;      ///waiting time -increase
                q.add(q.poll());
            }
        }
        return q.size();
    }
}