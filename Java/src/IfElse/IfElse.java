package IfElse;

import java.util.Scanner;

/**
 * Given an integer n on STDIN, perform multiple operations with IF-ELSE
 */

public class IfElse {
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numInt = myScanner.nextInt();

        myScanner.close();

        if (numInt % 2 != 0){
            System.out.println("Weird");
        } else {
            if (numInt >= 2 && numInt <= 5){
                System.out.println("Not Weird");
            } else if (numInt >= 6 && numInt <= 20){
                System.out.println("Weird");
            } else if (numInt > 20){
                System.out.println("Not Weird");
            }
        }
    }
}
