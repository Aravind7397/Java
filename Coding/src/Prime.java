public class Prime {
    public static void check(int n){
//        n = 50;
        for (int i = 1; i <= n; i++) {
            isprime(i);
        }
    }
    public static void isprime(int n) {
        int count = 0;
        for (int j = 2; j < n; j++) {
            if (n % j == 0){
                count ++;
            }
        }
        if(count == 0){
            System.out.println(n+ " is Prime");
        }
        else{
            System.out.println(n + "is not Prime");
        }
    }
}
