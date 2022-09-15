public class GCD {
    public static int checkGcd(int num1, int num2){
        int greatest = 0;
        if (num1 < 10 || num2 < 10)
            return -1;
        else{
            for(int i=1; ((i <= num1) && (i <= num2)); i++){
                if((num1 % i == 0) && (num2 % i == 0)){
                    greatest = i;
                }
            }
            return greatest;
        }
    }
}
