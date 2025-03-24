// Maximum Unqiue subarray sum after deletion

class Solution {
    public int maxSum(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(i > 0) set.add(i);
            else max = Math.max(max, i);
        }
        int sum = 0;
        if(set.size() > 0){
            for(int i : set){
                sum += i;
            }
            return sum;
        }
        return max;
    }
}