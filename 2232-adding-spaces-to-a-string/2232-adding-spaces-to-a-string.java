class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res= new StringBuilder();
        int j=0;
        for(int i=0; i<spaces.length; i++){
            res.append(s.substring(j, spaces[i])).append(" ");
            j=spaces[i];
        }
        res.append(s.substring(j,s.length()));
        return res.toString();
    }
}