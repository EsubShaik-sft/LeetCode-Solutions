class Solution {
    public boolean isValid(String s) {
       if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}'){
        return false;
       } 
       int n=s.length();
       Stack<Character> st= new Stack<>();
       for(int i=0;i<n;i++){
        char ch =s.charAt(i);
        if(ch == '(' || ch == '[' || ch == '{'){
            st.push(ch);
        }
        else{
            if(st.isEmpty()){
                return false;
            }
            char top=st.peek();
            if(( ch == ')' && top =='(') ||
             (ch == ']' && top == '[') ||
             (ch == '}' && top == '{')){
                st.pop();
             }
             else{
                return false;
             }
        }
       }
       if(st.isEmpty()){
        return true;
       }
       return false;
    }
}