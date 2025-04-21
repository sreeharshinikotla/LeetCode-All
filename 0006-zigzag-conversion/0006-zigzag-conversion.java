class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] rows= new StringBuilder[numRows];
        if(numRows==1) return s;
        for(int i=0; i<numRows; i++){
            rows[i]= new StringBuilder();
        }
        int j=0; boolean down=true;
        for(char c: s.toCharArray()){
            rows[j].append(c);
            if(j==0) down=true;
            if(j==numRows-1) down=false;
            j= down ? j+1 : j-1;
        }
        StringBuilder result=new StringBuilder();
        for(StringBuilder row: rows){
            result.append(row);
        }
        return result.toString();
    }
}