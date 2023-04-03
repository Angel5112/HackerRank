package StdInOut;

import java.util.Scanner;

/**
 * Read 3 integers from STDIN and display them as an STDOUT
 */

public class StdInOut {

    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);     // Scanner class to read User Input
        int firstInt = myScanner.nextInt();
        int secondInt = myScanner.nextInt();
        int thirdInt = myScanner.nextInt();

        myScanner.close();      // Always close the Scanner object after you have finish using it

        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(thirdInt);
    }
}
