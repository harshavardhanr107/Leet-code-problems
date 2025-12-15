class Solution {
    public int countDigits(int num) {
        int n = num;
        int i = 0;
        while(num>0){
            int a = num%10;
            if(n%a==0)i++;
            num/=10;
        }return i;
    }
}