

class Solution {
    private TreeMap<Integer, Integer> left = new TreeMap<>();
    private TreeMap<Integer, Integer> right = new TreeMap<>();
    private int leftSize = 0, rightSize = 0;
    private long leftSum = 0, rightSum = 0;
    private int targetLeft;

    private void add(TreeMap<Integer, Integer> map, int val) {
        map.put(val, map.getOrDefault(val, 0) + 1);
    }

    private void remove(TreeMap<Integer, Integer> map, int val) {
        int count = map.get(val);
        if (count == 1) {
            map.remove(val);
        } else {
            map.put(val, count - 1);
        }
    }

    private void addNum(int val) {
        if (left.isEmpty() || val <= left.lastKey()) {
            add(left, val);
            leftSum += val;
            leftSize++;
        } else {
            add(right, val);
            rightSum += val;
            rightSize++;
        }
        rebalance();
    }

    private void removeNum(int val) {
        if (left.containsKey(val)) {
            remove(left, val);
            leftSum -= val;
            leftSize--;
        } else {
            remove(right, val);
            rightSum -= val;
            rightSize--;
        }
        rebalance();
    }

    private void rebalance() {
        while (leftSize < targetLeft && rightSize > 0) {
            int val = right.firstKey();
            remove(right, val);
            rightSum -= val;
            rightSize--;

            add(left, val);
            leftSum += val;
            leftSize++;
        }

        while (leftSize > targetLeft) {
            int val = left.lastKey();
            remove(left, val);
            leftSum -= val;
            leftSize--;

            add(right, val);
            rightSum += val;
            rightSize++;
        }
    }

    private long getCost() {
        long median = left.lastKey();
        long costLeft = median * leftSize - leftSum;
        long costRight = rightSum - median * rightSize;
        return costLeft + costRight;
    }

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        this.targetLeft = (x + 1) / 2;

        long[] windowCost = new long[n];
        Arrays.fill(windowCost, Long.MAX_VALUE);

        for (int i = 0; i < n; i++) {
            addNum(nums[i]);
            if (i >= x) {
                removeNum(nums[i - x]);
            }
            if (i >= x - 1) {
                windowCost[i] = getCost();
            }
        }

        long[][] dp = new long[k + 1][n + 1];
        long INF = (long) 1e18;

        for (int j = 1; j <= k; j++) {
            Arrays.fill(dp[j], INF);
        }

        for (int j = 1; j <= k; j++) {
            for (int i = 1; i <= n; i++) {
                dp[j][i] = dp[j][i - 1];

                if (i >= x && windowCost[i - 1] != Long.MAX_VALUE && dp[j - 1][i - x] != INF) {
                    dp[j][i] = Math.min(dp[j][i], dp[j - 1][i - x] + windowCost[i - 1]);
                }
            }
        }

        return dp[k][n];
    }
}