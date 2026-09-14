// Last updated: 9/14/2026, 1:22:39 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare (a[1],b[1]));
        int n=0;
        long end=Long.MIN_VALUE;
        for(int[] b:points){
            if(b[0]<=end)
            continue;
            else{
               n++;
               end=b[1];
            }
        }
        return n;
    }
}