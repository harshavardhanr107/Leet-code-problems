class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)return true;
        double m = n;
        while(m>4){
            m/=4;
        }return m==4;
    }
}