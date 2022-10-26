public class posneg {

    public static void main(String[] args) {

       int num = 2;

        // true if number is less than 0
        if (num < 0)
            System.out.println(num + " is  negative number.");

        // true if number is greater than 0
        else if ( num > 0)
            System.out.println(num + " is  positive number.");

        // if both test expression is evaluated to false
        else
            System.out.println(num + " is 0");
    }
}
