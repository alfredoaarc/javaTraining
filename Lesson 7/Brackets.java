import java.util.*;

class Solution {
    public int solution(String input) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');

        for (char c : input.toCharArray()) {
            if (brackets.containsKey(c)) {
                stack.push(c);
            } else if (brackets.containsValue(c)) {
                if (stack.isEmpty() || brackets.get(stack.pop()) != c) {
                    return 0;
                }
            }
        }

        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}
