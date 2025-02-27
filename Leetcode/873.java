class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        if(arr.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int i : arr){
            set.add(i);
        }
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int first = arr[i];
                int second = arr[j];
                int curr =  2;
                while(set.contains(first + second)){
                    int temp = first;
                    first = second;
                    second = temp + second;
                    curr++;
                    max = Math.max(max, curr);
                }
            }
        }
        return max;
        
    }
}