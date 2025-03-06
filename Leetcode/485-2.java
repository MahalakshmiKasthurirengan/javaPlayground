class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                list.add(count);
                count = 0;
            } else if(nums[i] == 1){
                count++;
            }
        }
        list.add(count);
        Collections.sort(list);
        if(list.size() > 0){
            return list.get(list.size() - 1);
        }
        return 0;
    }
}