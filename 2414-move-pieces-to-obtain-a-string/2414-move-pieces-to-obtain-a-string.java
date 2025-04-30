class Solution {
    public boolean canChange(String start, String target) {
       int i=0,j=0;
       int n=start.length();
       while(i<n && j<n){
            while(j<n && target.charAt(j)=='_' ) j++;
            while(i<n && start.charAt(i)=='_') i++;
            if(i==n && j==n ) return true;
            if(i==n || j==n ) return false;
            
            if(start.charAt(i)!=target.charAt(j)) return false;

            char curr= start.charAt(i);
            if(curr=='L' && i<j) return false;
            if(curr=='R' && i>j) return false;
            i++; j++;
       } 
        while (i < n && start.charAt(i) == '_') i++;
        while (j < n && target.charAt(j) == '_') j++;
       return i == n && j == n;
    }
}