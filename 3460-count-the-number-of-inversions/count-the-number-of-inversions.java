class Solution {
    public int numberOfPermutations(int n, int[][] requirements) {
        int MOD = 1_000_000_007;

        int[] req = new int[n];
        Arrays.fill(req, -1);
        int maxInversions = 0;

        for (int[] r : requirements) {
            req[r[0]] = r[1];
            maxInversions = Math.max(maxInversions, r[1]);
        }

        if (req[0] > 0) {
            return 0;
        }

        int[] dp = new int[maxInversions + 1];
        dp[0] = 1;

        for (int len = 2; len <= n; len++) {
            int maxContribution = len - 1;
            int[] nextDp = new int[maxInversions + 1];

            long windowSum = 0;
            for (int j = 0; j <= maxInversions; j++) {
                windowSum = (windowSum + dp[j]) % MOD;

                if (j > maxContribution) {
                    windowSum = (windowSum - dp[j - maxContribution - 1] + MOD) % MOD;
                }

                nextDp[j] = (int) windowSum;
            }

            int requiredCount = req[len - 1];
            if (requiredCount != -1) {
                for (int j = 0; j <= maxInversions; j++) {
                    if (j != requiredCount) {
                        nextDp[j] = 0;
                    }
                }
            }

            dp = nextDp;
        }

        return dp[req[n - 1]];
    }
}