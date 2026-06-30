class Solution {
    public String firstPalindrome(String[] words) {

        //String rev = "";

        for(String ch : words){

            int i = 0;
            int j = ch.length()-1;
            boolean isPal = true;

            while(i < j){
                if(ch.charAt(i) != ch.charAt(j)){
                    isPal = false;
                    break;
                }

                i++;
                j--;
                
            }

            if(isPal){
                return ch;
            }

        }

        return "";
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna