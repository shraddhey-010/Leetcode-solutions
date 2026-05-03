 class Solution {
public:
    bool isPalindrome(int x) {
        int n = x;
        if (n < 0) {
            return false;
        }
        long long reverse_no = 0;
        while (n > 0) {
            int d = n % 10;
         reverse_no = reverse_no * 10 + d;
            n = n / 10;
        }
        if (reverse_no == x) {
            return true;
        } else {
            return false;
        }
    }
};
 