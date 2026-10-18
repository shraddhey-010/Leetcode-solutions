import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<int[]> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] == c) {
                stack.peek()[1]++;
                if (stack.peek()[1] == k) {
                    stack.pop();
                }
            } else {
                stack.push(new int[]{c, 1});
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int[] item : stack) {
            char ch = (char) item[0];
            int count = item[1];
            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }

        return sb.reverse().toString();
    }
}