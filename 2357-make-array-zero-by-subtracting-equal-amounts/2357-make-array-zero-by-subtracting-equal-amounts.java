class Solution {
    public int minimumOperations(int[] nums) {

        int count = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            else{
                set.add(nums[i]);
            }
        }
        for(int x : set){
            if(x != 0){
                count++;
            }
        }
        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna