//Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0){
            return 0;
        }

        int left = 0, right = height.length - 1, maxDis = 0;
        while(left <= right){
            int distance = right - left;
            int minDis = Math.min(height[right], height[left]);
            int area = distance * minDis;

            maxDis = Math.max(maxDis, area);
            if(height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }

        return maxDis;
    }
}