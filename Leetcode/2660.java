// Determine the winner of the bowling game
class Solution {
    public int isWinner(int[] player1, int[] player2) {
        if(player1.length == 0 && player2.length == 0 || player1.length != player2.length){
            return -1;
        }
        if(player1.length == 0 && player2.length != 0){
            return 2;
        }
        if(player1.length != 0 && player2.length == 0){
            return 1;
        }

        int s1 = 0;
        int s2 = 0;
        for(int i = 0; i < player1.length; i++){
            if(i == 0){
                s1 += player1[i];
                s2 += player2[i];
            }
            else if(i == 1){
                if(player1[i - 1] == 10) s1 += 2 * player1[i];
                else s1 += player1[i];

                if(player2[i - 1] == 10) s2 += 2 * player2[i];
                else s2 += player2[i];
            }

            else{
                if(player1[i - 1] == 10 || player1[i - 2] == 10) s1 += player1[i] * 2;
                else s1 += player1[i];

                if(player2[i - 1] == 10 || player2[i - 2] == 10) s2 += player2[i] * 2;
                else s2 += player2[i];

            }
        }

        if(s1 == s2){
            return 0;
        }

        return s1 > s2 ? 1 : 2;
    }
}