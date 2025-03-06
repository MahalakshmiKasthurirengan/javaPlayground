class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                set.remove(i);
            }
            else{
                set.add(i);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        return list.get(0);
    }
}