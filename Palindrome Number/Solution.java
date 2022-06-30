class Solution {
    public boolean isPalindrome(int x) {
        int revertedNumber = 0;
        //  If number is a negative number or last digit of the given number is equal to zero is not a palindrome
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        
        return x == revertedNumber || x == revertedNumber/10;
    }
}