class Solution {
    public String largestGoodInteger(String num) {
        String result= "";
        char[] digits = num.toCharArray();
        for(int i=0; i<digits.length-2; i++){
            if(digits[i]==digits[i+1] && digits[i]==digits[i+2]){
                    String candidate = "" + digits[i] + digits[i] + digits[i];
                    if (result.equals("") || candidate.compareTo(result) > 0) {
                    result = candidate;
                }
            }
        }
        return result;
    }
}