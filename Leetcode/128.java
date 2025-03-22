// Longest common subsequence 
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int longest = 0;
        for(int i : set){
            if(!set.contains(i - 1)){
                int currNum = i;
                int currVal = 1;
                while(set.contains(currNum + 1)){
                    currNum++;
                    currVal++;
                }
            longest = Math.max(longest, currVal);
            }
        }
        return longest;
    }
}