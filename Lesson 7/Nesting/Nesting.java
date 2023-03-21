import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (isOpen(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || !matches(stack.pop(), c)) {
                return 0;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public boolean isOpen(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public boolean matches(char open, char close) {
        return open == '(' && close == ')' || open == '{' && close == '}' || open == '[' && close == ']';
    }
}

