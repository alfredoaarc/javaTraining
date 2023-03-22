import java.util.*;

class Solution {
    public int solution(int[] H) {
        Stack<Integer> blocks = new Stack<>();
        int count = 0;

        for (int height : H) {
            while (!blocks.empty() && height < blocks.peek()) {
                blocks.pop();
            }

            if (blocks.empty() || height > blocks.peek()) {
                blocks.push(height);
                count++;
            }
        }

        return count;
    }
}
