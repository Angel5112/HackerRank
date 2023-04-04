package OutFormat;

import java.util.Scanner;;

/**
 * Format the input so that every element is separted 15 spaces from each other and
 * every integer with less than 3 digits fills with 0 at the left
 */

public class OutFormat {
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
            System.out.println("================================");
            for (int i = 0; i < 3; i++){
                String myString = myScanner.next();
                int myInt = myScanner.nextInt();
                //Complete this line

                System.out.printf("%-15s%03d%n", myString, myInt);
            }
            myScanner.close();
            System.out.println("================================");
    }
}
