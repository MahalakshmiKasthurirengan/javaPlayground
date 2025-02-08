// Function to determine if we can sum to k using given numbers
public static boolean canSumToK(int[] dp, int k) {
    int n = dp.length;
    boolean[] canSum = new boolean[k + 1];
    canSum[0] = true;

    for (int i = 0; i <= k; i++) {
        for (int j = 0; j < n; j++) {
            if (i + dp[j] <= k && canSum[i]) {
                canSum[i + dp[j]] = true;
            }
        }
    }
    return canSum[k];
}
