// Find the Unique Binary String

class Solution {
    int n;
    Set<String> set;
    public String findDifferentBinaryString(String[] nums) {
        if(nums.length == 0){
            return null;
        }
        n = nums.length;
        set = new HashSet<>();
        for(String s : nums){
            set.add(s);
        }

        return sol(0, "");
    }


    public String sol(int index, String temp){
        if(temp.length() == n){
            if(!set.contains(temp))
                return temp; 
        }

        if(index < n){
            String left = sol(index + 1, temp + '0');
            if(left != null) return left;

            String right = sol(index + 1, temp + '1');
            if(right != null) return right;
        }

        return null;
    }
}
