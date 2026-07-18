class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int base = Integer.MIN_VALUE;
        for(int x : nums){
            if(x > base) base = x;
        }

        int arr[] = new int[base+1];
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }
        arr[base] = base;
        String q = "";
        String a = "";

        for(int y : arr){
            q += y;
        }

        for(int z : nums){
            a += z;
        }

        if(q.equals(a)) return true;

        return false;


        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna