class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
    
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr){
            int need = target - num;
            
            if(set.contains(need)){
                return true;
            }
            set.add(num);
        }
        
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna