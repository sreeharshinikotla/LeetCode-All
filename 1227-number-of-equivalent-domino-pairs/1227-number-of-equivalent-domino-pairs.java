class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
       int[] count= new int[100];
       int res=0;
       for(int[] domino: dominoes){
        int key= Math.min(domino[0],domino[1])*10 + Math.max(domino[0],domino[1]);
        res+= count[key];
        count[key]++;
       }
       return res;
    }
}