package DSA Algorithm;

public class prefixSumInPlace {
    public int[] calculatePrefixSumInPlace(int arr[]){
        
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i];
        }

        return arr;
    }
}
