class Solution {
    public boolean divisorGame(int n) {
        if(1<=n &&n<=1000){
            if(n%2==0){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
}