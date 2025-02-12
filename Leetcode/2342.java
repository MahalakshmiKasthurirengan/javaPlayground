class Solution {
    public int maximumSum(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int ans = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            int total = getTotalSum(i);
            if(!map.containsKey(total)){
                map.put(total, i);
            }
            else{
                ans = Math.max(ans, map.get(total) + i);
                map.put(total, Math.max(map.get(total), i));
            }
        }
        return ans;
    }

    public int getTotalSum(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}