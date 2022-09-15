import java.util.ArrayList;

public class NumberToWords {
    public static void words(int num){
        if (num < 0){
            System.out.println("-1");
            return;
        }
        int temp = num;
        ArrayList <String> list = new ArrayList<String> ();
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        while(temp != 0){
            list.add(arr[temp %10]);
            temp = temp/10;
        }

        for(int i = list.size()-1; i >= 0; i--)
            System.out.print( list.get(i) + " ");
        System.out.println();

    }
}
