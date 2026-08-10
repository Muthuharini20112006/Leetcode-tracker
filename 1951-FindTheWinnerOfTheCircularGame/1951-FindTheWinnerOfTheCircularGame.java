// Last updated: 8/10/2026, 3:50:04 PM
class Solution {
    public int findTheWinner(int n, int k) {
     Queue<Integer> q=new LinkedList<>();
     for( int i=1;i<=n;i++){
        q.add(i);    
        }    //{1,2,3,4,5}
       while(q.size()!=1){
            //k=3
            for(int i=0;i<k-1;i++)
            q.add(q.poll());               //saved all previous number
              q.poll();     //delete 3 rd person
     }   
      return q.peek();
    }
}