class Solution {
    public int smallestEvenMultiple(int n) {
        if(1<=n && n<=150){
            if(n%2==0){
                return n;
            }else{
                return n*2;
            }
        }
        return 0;
    }
}