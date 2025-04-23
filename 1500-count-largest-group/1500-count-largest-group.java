class Solution {
    public int countLargestGroup(int n) {
        int[] index= new int[n+1];
        int res=0;
        for(int i=1; i<=n; i++){
            int curr=i;
            int sum=0;
            while(curr!=0){
                sum+= curr%10;
                curr= curr/10;
            }
            index[sum]++;
        } 
        Arrays.sort(index);
        int max= index[n];
        for(int i=n; i>=0; i--){
            if(index[i]==max) res++;
            else if(index[i]<max) return res;
        }
        return res;
    }
} 