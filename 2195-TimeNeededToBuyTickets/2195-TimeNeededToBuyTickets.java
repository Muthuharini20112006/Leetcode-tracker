// Last updated: 8/10/2026, 3:49:44 PM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++)
        q.add(i); // storing indexes
        int t=0;
        while(!q.isEmpty()){
            int ind=q.poll(); /// comes out of queue
            t++; ///he need 1sec to buy
            tickets[ind]--;
        if(tickets[ind]>0)
                  q.add(ind);
                  if( ind==k && tickets[ind]==0)
                  return t;
    }
    return t;
}
}