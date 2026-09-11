class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        boolean isGre = true;
        for(int i=0;i<s.length()-1;i++){
           int diff = Math.abs(s.charAt(i) - s.charAt(i + 1));
           if(diff > 2){
            isGre = false;
            break;
           }
        }
        if(isGre) return true;
        else return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna