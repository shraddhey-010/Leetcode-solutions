class Solution {
    public String removeDuplicates(String s) {
        StringBuilder clean = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (clean.length() > 0 && clean.charAt(clean.length() - 1) == ch) {
                
                clean.deleteCharAt(clean.length() - 1);
            } else {
            
                clean.append(ch);
            }
        }

        return clean.toString();
    }
}