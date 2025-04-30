class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0, j=0;
        char s1;
        char s2;
        while(i<str1.length()){
            s1= str1.charAt(i);
            s2= str2.charAt(j);
            if(s1=='z' && s2!='z')
                s1='a';
            if(s1==s2 || (s1-'a'+1)==(s2-'a')){
                i++;
                j++;
                if(j==str2.length()) return true;
            }
            else i++;
        }
        return false;
    }
}