class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for(String s : strs){
            boolean isDig = true;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)<'0' || s.charAt(i)>'9'){
                    isDig = false;
                    break;
                }
            }
            int val;
            if(isDig)val=Integer.parseInt(s);
            else val = s.length();
            max = Math.max(max,val);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna