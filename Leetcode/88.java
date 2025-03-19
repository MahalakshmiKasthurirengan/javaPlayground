// Merge two sorted array without creating extra space
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0 || n == 0){
            return;
        }
        int i = m + n - 1;
        n = n - 1;
        m = m - 1;
        while(n >= 0 && m >= 0){
            if(nums1[m] < nums2[n]){
                nums1[i--] = nums2[n--];
            }
            else{
                nums1[i--] = nums1[m--];
            }
        }
        while(n >= 0){
            nums1[i--] = nums2[n--];
        }
    }
}