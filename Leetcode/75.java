// Sort colors 0's, 1's and 2's in ascendind order

class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0){
            return;
        }
        int one = 0, two = 0, zero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zero++;
            else if(nums[i] == 1) one++;
            else if(nums[i] == 2) two++;
        }
        int index = 0;
        while(zero-- > 0){
            nums[index++] = 0;
        }
        while(one-- > 0){
            nums[index++] = 1;
        }
        while(two-- > 0){
            nums[index++] = 2;
        }

        return;
    }
}