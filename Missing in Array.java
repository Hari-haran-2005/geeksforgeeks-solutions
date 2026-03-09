class Solution {
    int missingNum(int arr[]) {
        
        long n = arr.length + 1;
        
        long totalSum = n * (n + 1) / 2;
        
        long arraySum = 0;
        
        for(int i = 0; i < arr.length; i++){
            arraySum = arraySum + arr[i];
        }
        
        long missing = totalSum - arraySum;
        
        return (int)missing;
    }
}
