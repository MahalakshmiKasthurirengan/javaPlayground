// Find the Winning Player of Coin Game
class Solution {
    public String winningPlayer(int x, int y) {
        if(x == 0){
            return "Bob";
        }
        if(y == 0){
            return "Alice";
        }
        int temp = Math.min(x, y / 4);
        if(temp % 2 == 0){
            return "Bob";
        }

        return "Alice";
    }
}
