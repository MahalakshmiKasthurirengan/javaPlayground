public long countBadPairs(int[] nums) {
    Map<Integer, Integer> map = new LinkedHashMap<>();
    long goodCount = 0;
    long n = nums.length;
    for(int i = 0; i < n; i++){
        int key = nums[i] - i;
        if(map.containsKey(key)){
            goodCount += map.get(key);
        }
        map.put(key, map.getOrDefault(key, 0) + 1);
    }
    long totalCount = n * (n - 1) / 2;
    long badCount = totalCount - goodCount;
    return badCount;
}