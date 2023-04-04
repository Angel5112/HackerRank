package TenMultiples;

import java.util.Scanner;

/**
 * Given an integer N, print the first 10 multiples in the form: N x i = Result
 */

public class TenMultiples {
    
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);

        int number = myScanner.nextInt();   // Getting User Input
        myScanner.close();

        for (int i = 1; i < 11; i++){
            int result = number * i;
            System.out.printf("%d x %d = %d%n", number, i, result);
        }
    }
}
