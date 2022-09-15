public class PerfectNumber {
    public static boolean check(int num){
        int count = 0;
        if(num > 1){
            for (int i=1; i < num; i++){
                if(num % i == 0){
                    count=count+1;
                }
            }
        }
        else{
            return false;
        }

        if (count > 1)
            return true;
        else
            return false;
    }

}
