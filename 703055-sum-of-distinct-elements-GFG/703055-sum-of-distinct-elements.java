class Solution {
    int findSum(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        int sum = 0;
        
        for(int x : arr){
            
            if(set.add(x)){
                sum += x;
            }
            
            
            
        }
        
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna