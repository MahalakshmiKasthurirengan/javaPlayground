class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 1 && nums[nums.length - 1] == 1){
            return 0;
        }
        if(nums.length == 1 && nums[nums.length - 1] == 0){
            return 1;
        }
        int sum = nums.length * (nums.length + 1) / 2;
        for(int i = 0; i < nums.length; i++){
            sum -= nums[i];
        }

        return sum;
    }
}