class Solution {
    static final int MOD = (int) 1e9 + 7;
    public int numOfSubarrays(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int prefixSum= 0, evenCount = 1, oddCount = 0;
        int result = 0;
        for(int num : nums){
            prefixSum += num;
            if(prefixSum % 2 == 0){
                result = (result + oddCount) % MOD;
                evenCount++;
            } else{
                result = (result + evenCount) % MOD;
                oddCount++;
            }
        }
        return result;

    }
}