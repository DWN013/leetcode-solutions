import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        int counter = s.length();

        for (int i = 0; i < s.length(); i++) {

            switch(s.charAt(i)){
                case '(':
                    stack.push(')');
                    break;
                
                case '[':
                    stack.push(']');
                    break;
                
                case '{':
                    stack.push('}');
                    break;

                //If stack is empty early or char popped from stack does not match closing parentheses, return false
                default:
                    if(stack.empty() || s.charAt(i) != stack.pop()) {
                        return false;
                    }
            }
        }

        return stack.empty();
    }
}
