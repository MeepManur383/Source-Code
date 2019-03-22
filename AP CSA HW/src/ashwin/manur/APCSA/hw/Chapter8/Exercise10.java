package ashwin.manur.APCSA.hw.Chapter8;

public class Exercise10 {
	public static void main(String[] args) {
		System.out.print(commentRemover(null));
	}
	
	public static String commentRemover(String str) {
		String result = "";
		if(str == null || str.length() == 0)
			return "Not Possible";
		if((str.indexOf("/*") != - 1 && str.indexOf("*/") != - 1) && str.indexOf("*/") > str.indexOf("/*")) {
			result = str.substring(0, str.indexOf("/*")) + str.substring(str.indexOf("*/") + 2);
			return result;
		}
		else
			return "Not Possible";
	}
}
