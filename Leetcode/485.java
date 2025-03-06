class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                if(count > 0)
                    l.add(count);
                count = 0;
            }
        }
        if(count > 0) l.add(count);
        if(l.isEmpty()) return 0;
        return Collections.max(l);
    }
}