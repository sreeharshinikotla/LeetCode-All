class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                char compare=' ';
               if(!stack.isEmpty()) 
               compare= stack.pop();
               else return false;
                if((c==')' && compare!='(')
                || (c=='}' && compare!='{')
                || (c==']' && compare!='[')
                )
                return false;
            }
        }
        return stack.isEmpty();
    }
}