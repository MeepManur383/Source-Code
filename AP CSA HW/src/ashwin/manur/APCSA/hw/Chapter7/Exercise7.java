package ashwin.manur.APCSA.hw.Chapter7;

public class Exercise7 {
	public static int studyTime() {
		int month = 0;
		double toGo = 100;
		int goal  = 95;
		double current = 0;
		while(current < goal) {
			current += (toGo * .1);
			toGo -= (toGo * .1);
			month ++;
		}
		return month;
	}
	public static void main(String[] args) {
		int months = studyTime();
		if(months > 12) {
			int years = months / 12;
			months %= 12;
			System.out.println(years + " year " + months + " months of studying.");
		}
		else
			System.out.println( months + " months of studying.");
		
 	}
}
