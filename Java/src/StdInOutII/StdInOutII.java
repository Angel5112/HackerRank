package StdInOutII;

import java.util.Scanner;

/**
 * Read an integer, a double and a String then proceed to print in the next order: String, double and integer
 */

public class StdInOutII {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int myInt = myScanner.nextInt();            // Reading an integer
        double myDouble = myScanner.nextDouble();   // Reading a double
        myScanner.nextLine();                       // Required to read the /n at the end of the nextDouble()
        String myString = myScanner.nextLine();     // Reading a String

        myScanner.close();      // Closing the scanner

        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
    }
}
