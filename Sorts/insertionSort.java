public static void insertionSort(int a[], int n){
    if(n <= 1) return;    
    for(int i = 1; i < n; i++){
        int key = a[i];
        int j = i - 1;
        
        while(j >= 0 && a[j] > key){
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;
    }
    
}
