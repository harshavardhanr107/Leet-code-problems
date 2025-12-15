class Solution {
    public double[] convertTemperature(double celsius) {
        
            double kel = celsius+273.15;
            double fahren = celsius*1.80+32.00;
            double[] result = new double[2];
            result[0] = kel;
            result[1] = fahren;
            return result;
    }
}