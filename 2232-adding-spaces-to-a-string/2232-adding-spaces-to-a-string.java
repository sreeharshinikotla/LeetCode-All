class Solution {
    public String addSpaces(String s, int[] spaces) {
        String[] words= new String[spaces.length+1];
        int j=0;
        for(int i=0; i<spaces.length; i++){
            words[i]= s.substring(j,spaces[i]);
            j=spaces[i];
        }
        words[spaces.length]= s.substring(j,s.length()); 
        return String.join(" ", words);
    }
}