package Day3;

public class PalindromeNumber {
    /*Given an integer x, return true if x is a palindrome, and false otherwise.*/

    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int result = 0;
        int temp = x;
        while(x != 0){
            int ge = x % 10;
            x = x / 10;

            result = result * 10 + ge;
        }

        if(result == temp){
            return true;
        }else{
            return false;
        }

    }
}
