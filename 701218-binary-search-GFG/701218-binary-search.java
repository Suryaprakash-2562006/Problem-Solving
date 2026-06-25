class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        
        int lb=0;
        int ub=arr.length-1;
        
        while(lb <= ub){
            
            int mid = (lb + ub) / 2;
            
            if(arr[mid] == k) return true;
            
            else if(arr[mid] < k) lb = mid + 1;
            
            else ub = mid - 1;
            
            
        }
        
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna