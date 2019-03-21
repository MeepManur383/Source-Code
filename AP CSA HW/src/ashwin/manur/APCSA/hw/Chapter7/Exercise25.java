package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;
public class Exercise25{
   public static void main(String[] args){
         Scanner kboard = new Scanner(System.in);
		   System.out.print("Enter the number of cents: ");
		   int n = kboard.nextInt();
         whatCoins(n);
         kboard.close();
   }
   public static void whatCoins(int amt){
      for(int quarters = 0; quarters * 25 <= amt; quarters++){
    	 int quarterTotal = quarters * 25; 
         for(int dimes = 0; dimes * 10 <= amt - quarterTotal; dimes++){
        	 int dimeTotal = dimes * 10;
            for(int nickels = 0; nickels * 5 <= amt - quarterTotal - dimeTotal; nickels++){
               int pennies = amt - quarterTotal - dimeTotal - nickels * 5;
               System.out.println( amt + " cent(s) = " + quarters + " quarters + " + dimes + " dimes + " + nickels + " nickels + " + pennies + " pennies"); 
            }
         }
      }
   }
   
}

