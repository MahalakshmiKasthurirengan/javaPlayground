// Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for(int i : map.values()){
            if(i > max) max = i;
        }
        int answer = 0;
        for(int i : map.keySet()){
            if(map.get(i) == max) answer = i;
        }

        return answer;
    }
}