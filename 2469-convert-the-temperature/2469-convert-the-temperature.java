class Solution {
    public double[] convertTemperature(double celsius) {

        //return new double[] {celsius + 273.15 , celsius * 1.80 + 32.00};

        double kel=celsius + 273.15;
        double fah=celsius * 1.80 + 32.00;
        double[] arr= {kel,fah};
        return arr;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna