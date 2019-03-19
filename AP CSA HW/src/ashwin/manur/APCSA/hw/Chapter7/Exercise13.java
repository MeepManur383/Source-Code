package ashwin.manur.APCSA.hw.Chapter7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args)
	  {
	    Scanner input = null;

	    try
	    {
	      input = new Scanner(new File("scores.dat"));
	      
	    }
	    catch (FileNotFoundException e)
	    {
	      System.out.println("***  Can't open scores.dat ***");
	      System.exit(1);
	    }
	    double inputCount = 0;
	    int sum = 0;
	    while(input.hasNextInt()) {
	    	sum += input.nextInt();
	    	inputCount++;
	    }
	    System.out.println("The average of the numbers is " + sum / inputCount);
	    input.close();
	  }
}
