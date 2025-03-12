// Teemo Attacking
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(duration == 0 || timeSeries.length == 0){
            return 0;
        }
        int ans = 0;
        for(int i = 0; i < timeSeries.length - 1; i++){
            ans += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        return ans + duration;
    }
}