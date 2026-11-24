class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char b = stack.pop();
                if (c == ')' && b != '(') return false;
                if (c == '}' && b != '{') return false;
                if (c == ']' && b != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}