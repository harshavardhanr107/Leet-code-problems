class Solution {
    public boolean isPalindrome(int x) {
       if(x<0)return false;
       int rev = 0;
       int c = x;
       while(x!=0){
        int revv = x%10;
        rev = rev*10+revv;
        x /= 10;
       }return rev==c;
    }
}