// Sort the array using below bubble sort algorithm
public static void bubbleSort(int a[], int n){
    if(n <= 1) return;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n - 1; j++){
            if(a[j] > a[j + 1]){
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
}