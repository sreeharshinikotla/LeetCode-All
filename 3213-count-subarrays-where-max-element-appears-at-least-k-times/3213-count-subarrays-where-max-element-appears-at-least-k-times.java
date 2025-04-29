class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0; i<n; i++)
        max= Math.max(max, nums[i]);
        int c=0;
        int l=0; int r=0;
        long res=0;
        while(r<n){
            if(nums[r]==max){
                c++;
            }
            r++;
            while(c>=k && l<=r){
                res= res+ (n-r+1);
                if(nums[l]==max) c--;
                l++;
            }
        }
        return res;
    }
}