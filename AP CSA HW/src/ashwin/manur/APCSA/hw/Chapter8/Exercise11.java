package ashwin.manur.APCSA.hw.Chapter8;

public class Exercise11 {
	
	private String str;

	public Exercise11(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		Exercise11 temp = new Exercise11(null);
		System.out.println(temp.cutOut(""));
	}
	
	public String cutOut(String cutMe) {
		if(str == null || cutMe == null)
			return "not possible";
		if(str.length() == 0 || cutMe.length() == 0)
			return "not possible";
		String result = "";
		if(str.indexOf(cutMe) != - 1) {
			result = str.substring(0,str.indexOf(cutMe)) + str.substring((str.indexOf(cutMe) + cutMe.length()));
			return result;
		}
		else
			return "not possible";

	}
	
	@Override
	public String toString() {
		return str;
	}

	
}
