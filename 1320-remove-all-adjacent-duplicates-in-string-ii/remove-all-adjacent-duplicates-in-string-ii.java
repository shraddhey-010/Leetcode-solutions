class Solution {
    private static class Hybrid {
        char ch;
        int count;

        Hybrid(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {
        Deque<Hybrid> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();

        for (char c: arr){
            if (!stack.isEmpty() && stack.peek().ch == c) {
                stack.peek().count++;
                if (stack.peek().count == k) {
                    stack.pop();
                }
            } else {
                stack.push(new Hybrid(c, 1));
            }
        }

        while (!stack.isEmpty()) {
            Hybrid hy = stack.pop();
            for (int i = 1; i <= hy.count; i++) {
                sb.append(hy.ch);
            }
        }

        return sb.reverse().toString();
    }
}