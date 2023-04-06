package EndOfFile;

import java.util.Scanner;

/**
 * Print the Strings of STDIN with the number of lines while there is not an EOF condition on the Scanner
 */

public class EndOfFile {

    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        int counter = 0;

        while(myScanner.hasNext()){     // Returns true if there are tokens in the Scanner (If there is still an input to read)
            counter++;
            System.out.println(counter + " " + myScanner.nextLine());   // Prints the line number + the STDIN String (While there is not EOF)
        }
    }
}
