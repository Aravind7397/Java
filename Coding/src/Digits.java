public class Digits {
    public static int sumOfDigits(int num){
        int sum=0, rem;
        do{
            rem = num%10;//12345
            num = num/10;
            sum = sum + rem;
        }
        while(num > 0);
        return sum;
    }
}
