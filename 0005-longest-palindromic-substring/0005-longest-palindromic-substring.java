class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        String result="";
        for(int i=0; i<s.length(); i++){
        String oddPalindrome = expandpalindrome(i, i, s);
            if(oddPalindrome.length()> result.length()){
                result= oddPalindrome;
            }
        String evenPalindrome = expandpalindrome(i, i+1, s);
            if(evenPalindrome.length()> result.length()){
                result= evenPalindrome;
            } 
        }
        return result;
    }

private String expandpalindrome(int left, int right, String s){
    
    while(left>=0 && right<s.length() && s.charAt(left)== s.charAt(right)){
                left-=1;
                right+=1;
    }
    return s.substring(left+1, right); 
}


}