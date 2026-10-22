import java.util.*;

class Solution {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                
                currentString = new StringBuilder();
                k = 0;
            } else if (c == ']') {
                int repeatCount = countStack.pop();
                StringBuilder decodedString = stringStack.pop();
                
                for (int i = 0; i < repeatCount; i++) {
                    decodedString.append(currentString);
                }
                
                currentString = decodedString;
            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
}