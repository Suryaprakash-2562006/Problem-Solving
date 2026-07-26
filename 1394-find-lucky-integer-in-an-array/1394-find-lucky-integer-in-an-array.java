class Solution {
    public int findLucky(int[] arr) {

        int freq[] = new int[501];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int max = -1;
        for(int i=0;i<freq.length;i++){
            if(freq[i] == i){
                if(i==0) continue;
                else max = freq[i];
            }
        }
        return max;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna