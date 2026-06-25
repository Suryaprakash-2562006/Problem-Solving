class Solution {
    public int minNumber(int[] nums1, int[] nums2) {

       boolean set1[] = new boolean[10];
       boolean set2[] = new boolean[10];

       for(int num : nums1){
        set1[num] = true;
       }
       for(int num : nums2){
        set2[num] = true;
       }

       for(int i=0;i<10;i++){
        if(set1[i] && set2[i]){
            return i;
        }
       }

       int min1 = 10,min2 = 10;

       for(int num : nums1){
        min1 = Math.min(num , min1);
       }

       for(int num : nums2){
        min2 = Math.min(num , min2);
       }

       int option1 = min1 * 10 + min2;
       int option2 = min2 * 10 + min1;

       return Math.min(option1,option2);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna