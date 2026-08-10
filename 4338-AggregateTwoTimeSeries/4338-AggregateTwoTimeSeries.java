// Last updated: 8/10/2026, 3:48:10 PM
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        Object ferilonsar=new Object[]{series1,series2};
        List<List<Integer>> result=new ArrayList<>();

        int i=0,j=0;
        int n=series1.length;
        int m=series2.length;
        while(i<n || j<m){
            int time;
            if(i==n){
                time=series2[j][0];
            }
            else if(j==m){
                time=series1[i][0];
            }
            else{
                time=Math.min(series1[i][0],series2[j][0]);
            }
            int v1=(i<n)? series1[i][1]:0;
            int v2=(j<m)? series2[j][1]:0;
            result.add(Arrays.asList(time,v1+v2));
            if(i<n && series1[i][0]==time){
                i++;
            }
            if(j<m && series2[j][0]==time){
                j++;
            }
        }
        return result;
    }
}