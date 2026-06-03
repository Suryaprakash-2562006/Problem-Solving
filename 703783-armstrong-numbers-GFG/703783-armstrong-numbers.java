// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        boolean isArm = false;
        
        int org = n;
        int n1 = n;
        int count = 0;
        int arm = 0;
        
        
        while(n > 0){
            int ld = n % 10;
            count++;
            n /= 10;
        }
        
        while(n1 > 0){
            int ld = n1 % 10;
            arm += mul(ld,count);
            n1 /= 10;
        }
        
        if(arm == org) isArm = true;
        
        return isArm;
        
    }
    
    public static int mul(int n , int c){
        int res = 1;
        
        for(int i=1;i<=c;i++){
            res = res * n;
        }
        
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna