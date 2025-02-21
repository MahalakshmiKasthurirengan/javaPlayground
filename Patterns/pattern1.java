package Patterns;

import java.util.*;

public class pattern1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++)
                System.out.print(k++ + " ");
            
            for(int j = (n * 2) - (i * 2); j >= 1 ; j--)
                System.out.print("  ");
                
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
                
            System.out.println();
        }

    }
}
