class Solution {
    public static void printPrimeFactorization(int n) {

        for (int i = 2; i <= n; i++) {

            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna