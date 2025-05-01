class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set= new HashSet<>();
        int size=banned.length;
        for(int i=0; i<size; i++)
        set.add(banned[i]);
        int sum=0, count=0;
        for(int i=1; i<=n; i++){
            if(!set.contains(i))
            {
                if(sum+i <= maxSum){
                    sum+= i;
                    count++;
                }
            }
        }
        return count;
    }
}