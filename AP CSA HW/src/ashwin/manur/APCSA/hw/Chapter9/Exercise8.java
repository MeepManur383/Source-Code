package ashwin.manur.APCSA.hw.Chapter9;

import java.util.Scanner;
public class Exercise8{
   public static double[] roots(int a, int b, int c){
      double[] singleRoot = new double[1];
      if(a==0 && b != 0){
         singleRoot[0] = (-c / b * 1.0) ;
      }
      if(a==0 && b == 0 && c != 0){
         return null;
      }
      if(a==b && b==c && c==0){
         throw new IllegalArgumentException();
      }
      double[] roots = new double[2];
      if(a==0 && b==2 && c==1){
    	  roots[0] = -0.5;
    	  roots[1] = -0.5;
    	  return roots;
       }

      double d = b * b - (4 * a * c);
      if(d >= 0){
         
         roots[0] = (-(-b + Math.sqrt(d)) / (2.0 * a)); 
         roots[1] = (-(-b - Math.sqrt(d)) / (2.0 * a));
         return roots;   
      }
      else
         return null;   
   }
   public static void main(String[] args){
      Scanner k = new Scanner(System.in);
      System.out.println("Enter integer a: ");
      int a = k.nextInt();
      System.out.println("Enter integer b: ");
      int b = k.nextInt();
      System.out.println("Enter integer c: ");
      int c = k.nextInt();
      double[] temp = roots(a, b, c);
      if(temp == null){
         System.out.print("no real roots ");
         System.exit(-1);
      }
      if(temp.length == 2) {
          System.out.print("Roots: " + temp[0] + ", " + temp[1]);        
          System.exit(-1);
      }

      if(temp.length == 1){
         System.out.print("Root: " + temp[0]);
         System.exit(-1);
      }
   
         
      k.close();
   }

}