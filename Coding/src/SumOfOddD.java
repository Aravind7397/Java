public class SumOfOddD {
    public static int sumOfOddDigits(int num){
        int sum=0, rem;
        if(num < 0 )
            return -1;
        do{
            rem = num%10;//12345
            num = num/10;
            if (rem % 2 != 0)
                sum = sum + rem;
        }
        while(num > 0);
        return sum;
    }
}
