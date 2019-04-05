package ashwin.manur.APCSA.hw.Chapter9;

public class Exercise17{
	   public static double average(int[] scores){
	      if(scores == null || scores.length == 0) {
	    	  return 0;
	      }
		  int sum = 0;
	      for(int i = 0; i < scores.length; i++){
	         sum += scores[i];
	      }
	      return sum / scores.length;
	   }
	   public static void main(String[] args){
	      int[] test = {2, 4, 6, 8, 10, 12};
	      System.out.println(average(test));
	      System.out.println(average(new int [0]));
	      System.out.println(average(null));

	   }
	}