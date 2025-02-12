package Greedy_Algorithm;

import java.util.*;
public class noOfCoins {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t <= 100 && t >= 1) {
            while(t-- > 0){
                int amount = sc.nextInt();
                List<Integer> list= new ArrayList<>();
                int coins[] = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
                if(amount <= 106 && amount >= 1){
                    for(int i = 0; i < coins.length; i++){
                        while(amount >= coins[i]){
                            amount -= coins[i];
                            list.add(coins[i]);
                        }
                    }
                }
                for(int i : list)
                    System.out.print(i + " ");
                System.out.println();
                
            }
            
        }
    }
}