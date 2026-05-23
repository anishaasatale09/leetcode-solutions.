class Solution {
    public boolean isPalindrome(int x) {
        int dup = x;
        int rev = 0;
        while (x > 0 ){
            int ls = x % 10;
            rev = ( rev * 10 )+ ls;
            x = x / 10;
        }
        if(rev == dup){
           return true;
        }else{
            return false;
        }
        
    }
}
