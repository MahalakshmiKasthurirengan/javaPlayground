// Next Permutation

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0){
            return;
        }
        int n = nums.length;
        int ind = -1;
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverseArr(nums, 0, n - 1);
            return;
        }

        for(int i = n - 1; i > ind; i--){
            if(nums[i] > nums[ind]){
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        reverseArr(nums, ind + 1, n - 1);
        return;
    }

    public void reverseArr(int [] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        return;
    }
}