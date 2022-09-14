public class Demo {

    void Hello(){
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println(max);
        System.out.println(min);

        long mas = 8832893732373l;
        System.out.println(mas);
        long maz = mas/2;
        System.out.println(maz);

        byte one = Byte.MAX_VALUE;
        System.out.println(one);
        byte two = (byte) (one/2);
        System.out.println(two);

        short the = Short.MAX_VALUE;
        System.out.println(the);
        short i = (short) (the/2);
        System.out.println(i);

        byte s1 = 127;
        short s2 = 23842;
        int s3 = 893838293;
        long s4 = (s1+s2+s3)*1000;
        System.out.println(s4);

        double budget = 1546.12;
        double petrol = 84.11;
        double diesel = 74.91;

        double quantityOfPetrol = budget/petrol;
        double quantityOfDiesel = budget/diesel;

        System.out.println(quantityOfPetrol);
        System.out.println(quantityOfDiesel);

        float petrol_quantity, diesel_quantity;
        Double petrol_quantity1, diesel_quantity1;
        float petrol_prices = 74.91f;
        float diesel_prices = 84.11f;
        float wallet_balance = 1546.12f;
        petrol_quantity = wallet_balance / petrol_prices;
        diesel_quantity = wallet_balance / diesel_prices;
        Double petrol_prices1 = 74.91;
        Double diesel_prices1 = 84.11;
        Double wallet_balance1 = 1546.12;
        petrol_quantity1 = wallet_balance1 / petrol_prices1;
        diesel_quantity1 = wallet_balance1 / diesel_prices1;

        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance + " is " + petrol_quantity);
        System.out.println ("The quantity of diesel that we can buy in " +wallet_balance + " is " + diesel_quantity);
        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance1 + " is " + petrol_quantity1);
        System.out.println ("The quantity of diesel that we can buy in " +wallet_balance1 + " is " + diesel_quantity1);
        boolean above18 = true;
        if(above18){
            System.out.println("Eligible to vote");
        }
        long length = 50l, breath = 40;
        double perimeter = 2*(length + breath);
        System.out.println(length);

        double len = 10, br = 15.7547F;
        double area = len * br;
        System.out.println(br);

        System.out.println("hello" + len+br);

//        String s1=new String("This is prepinsta Material");
//        String s2=new String("This is prepinsta Material");
//        System.out.println(s1==s2);
//        String s3="This is prepinsta Material";
//        System.out.println(s1==s3);
//        String s4="This is prepinsta Material";
//        System.out.println(s3==s4);
//        String s5="This is ";
//        String s6=s5+"prepinsta Material";
//        System.out.println(s3==s6);
//        final String s7 ="This is ";
//        String s8=s7+"prepinsta Material";
//        System.out.println(s3==s8);
//        System.out.println(s5==s7);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0)
            System.out.println("Invalid");

        long years = minutes/525600;
        long rmin = minutes - (years*525600);
        long days = rmin/1440;

        System.out.println(minutes + "min: " + years +"y " + days + "d");
    }
    public static void numbers(int a, int b, int c){
        if (a>0 && b>0 && c>0) {
            if(a == b && b==c && c==a)
                System.out.println("All numbers are equal");
            else if(a==b || b==c || c==a)
                System.out.println("Neither All value are equal or different");
            else
                System.out.println("All numbers are different");
        }
        else
            System.out.println("Invalid value");
        char alpha = 'e';
        switch(Character.toLowerCase(alpha)){
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("Entered Vowels");
                break;
            default:
                System.out.println("Not a vowel");
        }
        int numbers = -10;
        if (numbers >=0){
            switch(numbers){
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                default:
                    System.out.println("OTHER");
            }
        }
        else{
            System.out.println("Negative");
        }
    }
    public static boolean leap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static void numbersOfDays( int month, int years) {
        switch (month) {
            case 1:
                System.out.println("January " + years + " 31" + " days");
                break;
            case 2:
                System.out.println("Febuary " + years + (leap(years)? " 29" : " 28" ) + " days");
                break;
            case 3:
                System.out.println("March " + years + " 31" + " days");
                break;
            case 4:
                System.out.println("April " + years + " 30" + " days");
                break;
            case 5:
                System.out.println("May " + years + " 31" + " days");
                break;
            case 6:
                System.out.println("June " + years + " 30" + " days");
                break;
            case 7:
                System.out.println("July " + years + " 31" + " days");
                break;
            case 8:
                System.out.println("August " + years + " 31" + " days");
                break;
            case 9:
                System.out.println("September " + years + " 30" + " days");
                break;
            case 10:
                System.out.println("October " + years + " 31" + " days");
                break;
            case 11:
                System.out.println("November " + years + " 30" + " days");
                break;
            case 12:
                System.out.println("December " + years + " 31" + " days");
                break;
        }
    }
}

