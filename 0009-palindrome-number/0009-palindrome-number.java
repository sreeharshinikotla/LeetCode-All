class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x==0) return true;
        int y=x;
        int sum=0;
        while(y!=0){
            int rem= y%10;
            sum= sum*10+rem;
            y=y/10;
        }
        if(sum==x)
        return true;
        return false;
    }
}