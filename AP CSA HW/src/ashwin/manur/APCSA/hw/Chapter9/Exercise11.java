package ashwin.manur.APCSA.hw.Chapter9;

import java.util.Scanner;
public class Exercise11 {
	   public static int[] fibonacci(int n){
		  n++; 
		  int[] fibArr = new int[n];
		  fibArr[0] = 0;
	      if(n == 1) {
	    	  return fibArr;
	      }
		  fibArr[1] = 1;
	      for(int i = 2; i < n; i++){
	         fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
	      }
	      return fibArr;
	   }
	   public static void main(String[] args) {
		   Scanner k = new Scanner(System.in);
		   System.out.print("How many fibonacci numbers do you want: ");
		   int n = k.nextInt();
		   int[] printArr = fibonacci(n);
		   for(int i : printArr) {
			   System.out.print(i + " ");
		   }
		   k.close();
	   }
	   
	}
