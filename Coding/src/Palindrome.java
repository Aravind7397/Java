public class Palindrome {
    public static boolean checkPalindrome(int num){
        int palin = 0,rem, temp = num;
        while(temp != 0) {
            rem = temp % 10;//121
            palin = (palin  * 10 ) + rem;
            temp = temp/10;
        }
        if(palin == num)
            return true;
        else
            return false;
    }
}
