package DSA Algorithm;

import java.util.*;

/* Basic Program for two pointer approach 
 * there are different kinds of two pointer apporach
 * 1. Converging Pointers
 * 2. Parallel Pointers
 * 3. Trigger Based Pointers
 * 
 */

public class twoPointer {
    public static boolean findPair(int arr[], int target){
        if(arr.length == 0){
            return false;
        }
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while(left < right){
            int sum = arr[left] + arr[right];
            
            if(sum == target){
                System.out.println("Sum of "+ arr[left] + " and " + arr[right] + "is " + target);
                return true;
            } else if(sum < target){
                left++;
            } else{
                right--;
            }
        }
        System.out.println("No pair found!!");
        return false;
    }
}
