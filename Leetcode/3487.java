// Maximum Unqiue subarray sum after deletion

class Solution {
    public int maxSum(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int left = 0, currSum = 0, maxSum = 0;
        for(int right = 0; right < nums.length; right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            currSum += nums[right];
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}