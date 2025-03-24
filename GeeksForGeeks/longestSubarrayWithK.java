package GeeksForGeeks;

public class longestSubarrayWithK {
    public int longestSubarray(int[] arr, int k) {
        if(arr.length == 0){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, max = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            max = Math.max(max, i - map.getOrDefault(sum - k, i));
            
            if(map.get(sum) == null) map.put(sum, i);
        }
        return max;
    }
}
