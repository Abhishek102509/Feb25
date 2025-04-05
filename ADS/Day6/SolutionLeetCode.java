import java.util.Stack;

class SolutionLeetCode {
    public boolean isValid(String s) {
        Stack<Character> b1 = new Stack<>();

        char[] c = s.toCharArray();
        int l = c.length;

        for (int i = 0; i < l; i++) {
            if (c[i] == '{' || c[i] == '[' || c[i] == '(') {
                b1.push(c[i]);
            } else if (c[i] == '}' || c[i] == ']' || c[i] == ')') {
                if (b1.isEmpty() || 
                    (c[i] == '}' && b1.peek() != '{') || 
                    (c[i] == ']' && b1.peek() != '[') || 
                    (c[i] == ')' && b1.peek() != '(')) {
                    return false; // Return false when brackets are not balanced
                }
                b1.pop();
            }
        }

        return b1.isEmpty(); // True if stack is empty at the end
    }
}