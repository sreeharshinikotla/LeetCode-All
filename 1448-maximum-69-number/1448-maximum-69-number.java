class Solution {
    public int maximum69Number (int num) {
        //dont change 9 to 6, change first occurence of 6 to 9
        char[] digits = String.valueOf(num).toCharArray();
        for(int i = 0; i < digits.length; i++){
            if (digits[i] == '6') {   
                digits[i] = '9';      
                break;                
            }
        }
        return Integer.valueOf(new String(digits));
    }
}