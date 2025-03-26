// Subarray Sum equals  K
class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == k){
                count++;
            } 
            if(map.get(sum - k) != null){
                count += map.get(sum - k);
            }
            Integer val = map.get(sum);
            if(val == null){
                map.put(sum, 1);
            } else{
                map.put(sum, val + 1);

            }
        }

        return count;
    }
}