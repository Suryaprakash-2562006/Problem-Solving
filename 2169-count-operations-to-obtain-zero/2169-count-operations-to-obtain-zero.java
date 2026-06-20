class Solution {
    public int countOperations(int num1, int num2) {
        int count = 0;

        if(num1 == 0 && num2 == 0){
            return 0;
        }

        if(num1 == num2){
            return 1;
        }

        while(num1 > 0 && num2 > 0){
            if(num1 < num2){
                num2 = num2 - num1;
            }
            else{
                num1 = num1 - num2;
            }
            count++;

        }

        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna