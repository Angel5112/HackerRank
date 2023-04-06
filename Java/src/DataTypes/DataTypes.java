package DataTypes;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int t = myScanner.nextInt();

        for(int i = 0; i < t; i++)
        {

            try
            {
                long x = myScanner.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x >= -128 && x <= 127){
                    System.out.println("* byte");
                }
                if(x >= -32768 && x <= 32767){
                    System.out.println("* short");
                }
                if(x >= -2147483648 && x <= 2147483647){
                    System.out.println("* int");
                }
                if(x >= (long) Math.pow(-2, 63) && x <= (long) (Math.pow(2, 63) - 1)){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(myScanner.next() + " can't be fitted anywhere.");
            }

        }
    }
}
