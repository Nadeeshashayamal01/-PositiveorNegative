public class posneg {

    public static void main(String[] args) {

       int number = 2;

        // true if number is less than 0
        if (number < 0)
            System.out.println(number + " is  negative number.");

        // true if number is greater than 0
        else if ( number > 0)
            System.out.println(number + " is  positive number.");

        // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0");
    }
}
