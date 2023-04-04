package Queries;

import java.util.Scanner;

/**
 * Implement the next series: (a + 2^0 * b)
 */

public class Queries {
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int t = myScanner.nextInt();
        for(int i = 0; i < t; i++){
            int a = myScanner.nextInt();
            int b = myScanner.nextInt();
            int n = myScanner.nextInt();
            int result = a + 1 * b;

            System.out.print(result + " ");

            for (int j = 1; j < n; j++){
                
                result += (int) Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            System.out.println();
            result = a + 1 * b;
        }
        myScanner.close();
    }
}
