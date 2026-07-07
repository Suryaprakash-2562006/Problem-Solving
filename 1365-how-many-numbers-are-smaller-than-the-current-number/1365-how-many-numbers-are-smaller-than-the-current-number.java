class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int arr[] = new int[nums.length];
        
        // for(int i=0;i<nums.length;i++){
        //     int count = 0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i] > nums[j]) count++;
                
        //     }
        //     arr[i] = count;
        // }
        // return arr;

        int freq[] = new int[101];

        for(int num : nums){
            freq[num]++;
        }

        for(int i=1;i<freq.length;i++){
            freq[i] += freq[i-1];
        }

        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) arr[i] = 0;
            else arr[i] = freq[nums[i]-1]; 
        }
        return arr;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna