class Solution {
    public int[] evenOddBit(int n) {

        String str = Integer.toBinaryString(n);
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        int even = 0,odd = 0;

        for(int i=0;i<rev.length();i++){

            if(i % 2 == 0 && rev.charAt(i) == '1'){
                even++;
            }
            else if(i % 2 != 0 && rev.charAt(i) == '1'){
                odd++;
            }
            
        }

        return new int[]{even,odd};
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna