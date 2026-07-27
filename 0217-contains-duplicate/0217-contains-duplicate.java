class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet<Integer> s = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(s.contains(nums[i])){
        //         return true;
        //     }
        //     s.add(nums[i]);
        // }
        // return false;
        /*
        HashSet<Integer> s = new HashSet<>();
        for(int num : nums){
        if(s.contains(num)){
        retuen true;
        }
        }

        return false;

        */



        HashSet<Integer> a = new HashSet<>();
        for(int num : nums) {
            a.add(num);
        }
        if(a.size() == nums.length) return false;
        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna