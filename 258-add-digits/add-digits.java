class Solution {
    public int addDigits(int num) {
        if(0<=num && num<=9)return num;
        int nn=0;
        while(num>9){
            int a = num%10;
            int b = num/10;
            nn = a+ b;
            num=nn;
        }
        return nn;
    }
}