class Solution {
    public int secondHighest(String s) {
        if(s.length() == 0){
            return -1;
        }

        char ch[] = s.toCharArray();
        Set<Integer> set = new HashSet<>();
        TreeSet<Integer> tree = new TreeSet<>();

        for(char c : ch){
            if(Character.isDigit(c)){
                int m = c - '0';
                if(set.contains(m)){
                    continue;
                } else{
                    set.add(m);
                    tree.add(m);
                }
            }
        }
        if(tree.size() == 1 || tree.size() == 0)
            return -1;

        int ans = -1;
        if(tree.size() >= 2){
            tree.pollLast();
            ans = tree.pollLast();
        }  
        return ans;  
    }
}